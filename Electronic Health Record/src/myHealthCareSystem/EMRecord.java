package myHealthCareSystem;

/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *		REVIEW THIS FILE, ASSIGNMENT INSTRUCTIONS, UML Class Diagram CAREFULLY BEFORE YOU START CODING!
 *
 * 	Remove unneeded comments/code when you are done. (Clean code is better code).
 * 
 * 	Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024)
 * 
 */

/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/**
 * This class represents the Electronic Health Records for a patient.
 */
public class EMRecord extends EMHRecord		{
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */

	
	
	/**
	 * Declaring the class-level variables: height, weight
	 */

	private int height;
	private int weight;
	/**
	 * Declaring object of Name
	 */
	private Name name;
	/**
	 * Declaring object of Address
	 */
	private Address address;
	
	/**
	 * Constructs an EMRecord object with the provided information.
	 * 
	 * @param reportingFacilityProvince the province of the reporting facility
	 * @param institutionNumber the institution number
	 * @param chartNumber the chart number
	 * @param healthCareNumber the health care number
	 */
	public EMRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber){
		super(reportingFacilityProvince,institutionNumber,chartNumber, healthCareNumber);
	}	

	/**
	 * Create getters for the class-level variables
	 * @return the value of height with integer data type
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @return the value of weight  with the data type of integer
	 */
	public int getWeight() {
		return weight;
	}
	
	/**
	 * Create setters for the class-level variables since they are private 
	 * @param height will set the value in the variable height
	 */
	public void setHeight(int height) {
		if(height > 0) {
		this.height = height;
		}
	}

	/**
	 * @param weight will set the value in the weight
	 */
	public void setWeight(int weight) {
		if(weight > 0) {
		this.weight = weight;
		}
	}
	/**
	 * @param name the Name object to be set as the name
	 */
	public void setName(Name name) {
		if (name != null) {
			this.name = name;
		}else {

		}
	}
	/**
	 * @param address the Address object to be set as the address
	 */
	public void setAddress(Address address) {
		if (address != null) {
			this.address = address;
		}else {
			
		}
	}
	/**
	 * @return the formatted name if it is set, or a message indicating that the address is not set
	 */
	public String formattedName() {
		if (name != null) {
		return name.formattedName();	
		}else {
			return "Name did not set";
		}
	}
	/**
	 * @return the formatted address if it is set, or a message indicating that the name is not set
	 */
	public String formattedAddress() {
		if(address != null) {
		return address.formattedAddress();
		}else {
			return "Address did not set";
		}
	}
	/**
	 * @return the calculated BMI as an integer value
	 */
	public int bmi() {
		return  (int) MedicalCalculator.calculateBMI(height, weight);
	}
	/**
	 * a string containing the class name and its attributes including height, weight, name, and address
	 */
	@Override
	public String toString(){
			
			return super.toString() +getClass().getName() + "[height=" + height + ", weight=" + weight + ", name=" + name + ", address=" + address + "]";
		}
		
	
	
	
	
	
}
