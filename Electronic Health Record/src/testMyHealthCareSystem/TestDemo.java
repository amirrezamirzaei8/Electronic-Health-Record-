package testMyHealthCareSystem;

import myHealthCareSystem.*;
/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/**
 * This is a simple test demo class for the health care system.
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/*
		 * TODO: You must use the System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). Do not miss any item (includes any
		 * attributes which are complex objects, name, address etc.
		 *
		 *		Use the following standards guide to discover what field entries might look like for demo purposes.
		 *
		 * 	Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 *
		 */

		//			sample test of BirthDate class
		//			BirthDate bd = new BirthDate(1970,12,01);
		//			System.out.println("BirtDate is:" + bd);
		/**
		 * Initializes a Name object and named it patient1
		 */
		Name patient1 = new Name("John Alan");
	//	Name patient1 = new Name("Alan,John");
		
		/**
		 * Initializes an Address object and named it patient1Address with the provided information.
		 */
		Address patient1Address = new Address("Ainsley ","1711 ","Ottawa ","Canada ","K2C 0S8 ");
		
		/**
		 * Initializes a BirthDate object with the provided year, month, and day and named it patient1bd.
		 */
		BirthDate patient1bd = new BirthDate(2004,01,05);
		
		/**
		 * Constructs an EMRecord object with the provided information.
		 * 
		 * @param reportingFacilityProvince the province of the reporting facility
		 * @param institutionNumber         the institution number
		 * @param chartNumber               the chart number
		 * @param healthCareNumber          the health care number
		 */
		EMRecord record = new EMRecord("British Columbia","0428","111","041118069");
		
		/**
		 * Sets the height of the patient.
		 * @param height the height of the patient in centimeters
		 */
		record.setHeight(180);
		
		/**
		 * Sets the weight of the patient.
		 * @param weight the weight of the patient in kilograms
		 */
		record.setWeight(90);
		
		/**
		 * Sets the name of the patient.
		 * @param name the Name object representing the patient's name
		 */
		record.setName(patient1);
		
		/**
		 * Sets the address of the patient.
		 * @param address the Address object representing the patient's address
		 */
		record.setAddress(patient1Address);
		
		/**
		 * Calculates the Body Mass Index (BMI) of the patient.
		 * @return the calculated BMI
		 */
		record.bmi();
		
		/**
		 * Sets the functional center account for the EMRecord.
		 * @param functionalCentreAccount the functional center account associated with the EMRecord
		 */
		record.setFuncitonalCentreAccount("Center123");
		
		/**
		 * Sets the encounter sequence for the EMRecord. 
		 * @param encounterSequence the encounter sequence number
		 */
		record.setEncounterSequence(10);
		
		/**
		 * Sets the issuing province for the EMRecord. 
		 * @param issuingProvince the province where the record was issued
		 */
		record.setIssuingProvince("British Columbia");
		
		/**
		 * Sets the residence code for the EMRecord.
		 * @param residenceCode the residence code associated with the patient
		 */
		record.setResidenceCode("BC1");
		
		/**
		 * Sets the gender of the patient. 
		 * @param gender the gender of the patient
		 */
		record.setGender("Male");
		
		/**
		 * Sets the submission year for the EMRecord.
		 * @param submissionYear the year when the record is submitted
		 */
		record.setSubmissionYear(2024);
		
		/**
		 * Sets the mode of administration via ambulance for the EMRecord.
		 * @param adminViaAmbulance the mode of administration via ambulance
		 */
		record.setAdminViaAmbulance("Ambulance");
		
		/**
		 * Sets the registration date for the EMRecord.
		 * @param registrationDate the registration date of the record
		 */
		record.setRegistrationDate(20240210);
		
		/**
		 * Sets the registration time for the EMRecord.
		 * @param registrationTime the registration time of the record
		 */
		record.setRegistrationTime(1700);
		
		/**
		 * Sets the Birth Date for patient 1.
		 */
		record.setBirthDate(patient1bd);
		
		/**
		 * printing out the patient information by using printf format.
		 */
		System.out.printf("Information about the patient is:\n");
		System.out.printf("Patient's Full Name: %s\n",record.formattedName());
		System.out.printf("Patient's Address is: %s\n", record.formattedAddress());
		System.out.printf("Patient's Height and Weight is: %scm, %skg\n", record.getHeight(),record.getWeight());
		System.out.printf("Patient's Functional Centre Account is: %s\n", record.getFuncitonalCentreAccount());
		System.out.printf("Patient's Encounter Sequence is: %s\n", record.getEncounterSequence());
		System.out.printf("Patient's Issuing Province is: %s\n",record.getIssuingProvince());
		System.out.printf("Patient's Residence Code is: %s\n",record.getResidenceCode());
		System.out.printf("Patient's Gender is: %s\n",record.getGender());
		System.out.printf("Patient's Submision Year is: %s\n",record.getSubmissionYear());
		System.out.printf("Patient's Registration Date and Time is: %s, %s\n",record.getRegistrationDate(),record.getRegistrationTime());
		System.out.printf("Patient's Birthday is: %s\n",record.getBirthDate());
		

		/*	TODO: Calculate the BMI for your patient record here.
		 * 		use the static method in the MedicalCalculator class along with instance variables from the
		 * 		EMHRecord class.
		 */
		/**
		 * Calculates the Body Mass Index (BMI) for Patient 1 by using the static method in the MedicalCalculator class.
		 * @param weight the weight of Patient 1 in kilograms
		 * @param height the height of Patient 1 in centimeters
		 * @return the calculated BMI for Patient 1
		 */
		double patient1BMI = MedicalCalculator.calculateBMI(record.getWeight(),record.getHeight());
		System.out.printf("BMI of patient1: %s\n",record.bmi());
		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.print("----------------------------------------------------------------------------");
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
		System.out.println("Program by Amirreza Mirzaei");
	
	}

}
