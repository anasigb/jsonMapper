package jsonMapper;

public class Address {
	String streetAddress;
	String city;
	String postalCode;
	
	
	public Address() {
	
	}
	public Address(String streetAddress, String city, String postalCode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
