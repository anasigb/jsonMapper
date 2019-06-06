package jsonMapper;

public class PhoneNumber {

	String type;
	String number;
	
	public PhoneNumber() {
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
