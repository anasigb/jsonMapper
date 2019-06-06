/**
 * 
 */
package jsonMapper;

import org.codehaus.jackson.JsonNode;

/**
 * @author anas.igbariah
 *
 */
public class Customer {
	String firstName;
	String lastName;
	int age;
	JsonNode address;
	PhoneNumber[] numbers;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, int age, JsonNode address, PhoneNumber[] numbers) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.numbers = numbers;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public JsonNode getAddress() {
		return address;
	}

	public void setAddress(JsonNode address) {
		this.address = address;
	}

	public PhoneNumber[] getPhoneNumbers() {
		return numbers;
	}

	public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
		this.numbers = phoneNumbers;
	}
}
