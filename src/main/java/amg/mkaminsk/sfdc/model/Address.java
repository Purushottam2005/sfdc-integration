package amg.mkaminsk.sfdc.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address extends Referencable {

	private static String REFERENCE_PREFIX = "/addresses/";

	@XmlAttribute
	String country;

	@XmlAttribute
	String city;

	@XmlAttribute
	String state;

	@XmlAttribute
	String street;

	@XmlAttribute
	String postalCode;
	
	

	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	@Override
	public void setReferenceId(String id) {
		href = REFERENCE_PREFIX + id;
	}
}
