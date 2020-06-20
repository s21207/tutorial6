package pgo6;

public class Task2 {
	
}

class Address {
	public String createAddress(String country) {
		return String.format("Country: %s", country);
	}
	
	public String createAddress(String country, String city) {
		return String.format("Country: %s, City: %s", country, city);
	}
	
	public String createAddress(String country, String city, String post) {
		return String.format("Country: %s, City: %s, Postal Code: %s", country, city, post);
	}
	
	public String createAddress(String country, String city, String post, String street) {
		return String.format("Country: %s, City: %s, Postal Code: %s, Street Name: %s", country, city, post, street);
	}
	
	public String createAddress(String country, String city, String post, String street, int num) {
		return String.format("Country: %s, City: %s, Postal Code: %s, Street Name: %s, Apartment Number: %d", country, city, post, street, num);
	}
}
