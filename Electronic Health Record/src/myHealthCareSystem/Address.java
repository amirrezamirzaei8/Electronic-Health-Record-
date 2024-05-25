package myHealthCareSystem;

/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/**
 * This class represents the Address information of a patient.
 */
public class Address {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */

	
	/**
	 * Declaring the class-level variables street
	 */
	 private String street;
		/**
		 * Declaring the class-level variables number
		 */
	 private String number;
		/**
		 * Declaring the class-level variables city
		 */
	 private String city;
		/**
		 * Declaring the class-level variables country
		 */
	 private String country;
		/**
		 * Declaring the class-level variables postalCode
		 */
	 private String postalCode;
	 
	
	
	/**
	 * Creating a constructor for this class
	 * @param street  will set the value of the street to the class-level variable
	 * @param number  will set the value of the number to the class-level variable
	 * @param city  will set the value of the city to the class-level variable
	 * @param country  will set the value of the country to the class-level variable
	 * @param postalCode  will set the value of the postalCode to the class-level variable
	 */
	 public Address(String street,String number,String city,String country,String postalCode) {
		 this.street = street;
		 this.number = number;
		 this.city = city;
		 this.country = country;
		 this.postalCode = postalCode;
	 }
	
	
	/**
	 * Generating the getters for the class-level variables since they are private
	 * @return the value of the class-level variable called street
	 */
	 	public String street() {
	 		if(street != null) {
			return street;
	 		}else {
	 			return "";
	 		}
		}
	 	/**
	 	 * 
	 	 * @return the value of the class-level variable called postalCode
	 	 */
		public String postalCode() {
			if(postalCode != null) {
			return postalCode;
			}else {
				return "";
			}
		}
		/**
		 * 
		 * @return the value of the class-level variable called city
		 */
		public String getCity() {
			if(city != null) {
			return city;
			}else {
				return "";
			}
		}
	
	
	/**
	 * Generating setters for the class-level variables because they are declared as private
	 * @param street will set the value of the class-level variable street
	 */
	public void setStreet(String street) {
		if(street != null) {
		this.street = street;
		}
	}
	/**
	 * @param number will set the value of the class-level variable number
	 */
	public void setNumber(String number) {
		if(number != null) {
		this.number = number;
		}
	}
	
	/**
	 * @param city will set the value of the class-level variable city
	 */
	public void setCity(String city) {
		if(city != null) {
		this.city = city;
		}
	}

	/**
	 * @param country will set the value of the class-level variable country
	 */
	public void setCountry(String country) {
		if(country != null) {
		this.country = country;
		}
	}

	/**
	 * @param postalCode will set the value of the class-level variable postalCode
	 */
	public void setPostalCode(String postalCode) {
		if(postalCode != null) {
		this.postalCode = postalCode;
		}
	}

	
	/**\
	 * Creating the method named formattedAddress
	 * @return the formatted address in this order: number + street + city + country + postalCode
	 */
	public String formattedAddress() {
		if(number != null && street != null && country != null && postalCode != null) {
		return number + "" + street + "" + city + "" +  country + ""+ postalCode;
		}else {
			return "";
		}
	}
	/**
	 * Convert this objectd into a meaningful string.
	 * @return this object as a string.
	 */
	@Override
	public String toString() {
		
		return getClass().getName() + "[street=" + street + ", number=" + number + ", city=" + city + ", country=" + country + ", postalCode=" + postalCode + "]";
	}
	
	
	

	


}
