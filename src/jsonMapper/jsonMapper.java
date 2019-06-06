package jsonMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class jsonMapper {
	   static Logger logger = Logger.getLogger(jsonMapper.class);

	public static void main(String[] args) {
	    BasicConfigurator.configure();
	    ObjectMapper objectMapper = new ObjectMapper();
        JSONObject 	customerData = new JSONObject();

	    logger.info("Openning file"+ args[0]);
		File file = new File(args[0]);
		FileInputStream fis;
		byte[] data;
		String bufferedJson = "";
		try {
			fis = new FileInputStream(file);
			data = new byte[(int) file.length()];
		    logger.info("reading file info");
			fis.read(data);
			fis.close();
		    logger.info("file closed");
			bufferedJson = new String(data, "UTF-8");	
		}
		catch (IOException e1) {
			logger.error("error buffering file");
			e1.printStackTrace();
		}
		try{
		    logger.info("parsing customer data");
			Customer customer = objectMapper.readValue(bufferedJson, Customer.class);
			customerData.put("firstName", customer.getFirstName());
			customerData.put("lastName", customer.getLastName());
			customerData.put("age", Integer.toString(customer.getAge()));
			
			JsonNode addressObject = customer.getAddress();
			customerData.put("address", addressObject);
			
			JSONArray numbersArray = new JSONArray();
			PhoneNumber[] numbers;
			numbers = customer.getPhoneNumbers();
			for (int i = 0; i<customer.getPhoneNumbers().length;i++) {
				JSONObject number = new JSONObject();
				number.put("type", numbers[i].getType());
				number.put("number", numbers[i].getNumber());
				numbersArray.add(number);
			}
			customerData.put("phoneNumbers", numbersArray);
		    logger.info("customer data parsed successfully");

		    logger.info("writing to file C:\\jsontest.txt");
		}
		 catch (IOException e1) {
		    logger.error("error parsing json file");
			e1.printStackTrace();
		}
		try{
			FileWriter fw=new FileWriter("C:\\jsontest.txt");    
			fw.write(customerData.toJSONString());    
	        fw.flush();			
		} catch (IOException e1) {
		    logger.error("error writing to file");
			e1.printStackTrace();
		}
		
		logger.info("Success...");    
        logger.info("Exiting application.");
	}    

}
