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
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024).
 * 
 */


/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/**
*/
/**
 * This class represents the Electronic Health Records for a patient.
 */
public class EMHRecord {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 * 
	 * 		Provide get and set methods for all attributes that are not accounted for as constructor parameters.
	 */
	/**
	 * Declaring all the class-level variables for this class and an object of the BirthDate class.
	 */
	private String reportingFacilityProvince;    
	private String institutionNumber;	
	private String funcitonalCentreAccount;
	private int encounterSequence; 
	private String healthCareNumber;	
	private String chartNumber;	
	private String issuingProvince;
	private String residenceCode;
	private String gender;
	private int submissionYear;
	private String adminViaAmbulance;
	private int registrationDate;
	private int registrationTime;
	private BirthDate birthDate;
	
	/**
	 * Constructs an EMRecord object with the provided information.
	 * @param reportingFacilityProvince the province of the reporting facility
	 * @param institutionNumber the institution number
	 * @param chartNumber  the chart number
	 * @param healthCareNumber the health care number
	 */
	public EMHRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.chartNumber = chartNumber;
		this.healthCareNumber = healthCareNumber;
	}
	/**
	 * @return the value of funcitonalCentreAccount
	 */
	public String getFuncitonalCentreAccount() {
		if (funcitonalCentreAccount != null) {
		return funcitonalCentreAccount;
		}else {
			return "";
		}
	}

	/**
	 * @param funcitonalCentreAccount the value will be set with this method
	 */
	public void setFuncitonalCentreAccount(String funcitonalCentreAccount) {
		if (funcitonalCentreAccount != null) {
		this.funcitonalCentreAccount = funcitonalCentreAccount;
		}
	}

	/**
	 * @return the value of encounterSequence
	 */
	public int getEncounterSequence() {
		return encounterSequence;
	}

	/**
	 * @param encounterSequence the value will be set with this method
	 */
	public void setEncounterSequence(int encounterSequence) {
		if (encounterSequence > 0) {
		this.encounterSequence = encounterSequence;
		}
	}

	/**
	 * @return the value of issuingProvince
	 */
	public String getIssuingProvince() {
		if (issuingProvince != null) {
		return issuingProvince;
		}else {
			return "";
		}
	}

	/**
	 * @param issuingProvince the value of issuingProvince will be set
	 */
	public void setIssuingProvince(String issuingProvince) {
		if (issuingProvince != null) {
		this.issuingProvince = issuingProvince;
		}
	}

	/**
	 * @return the value of residenceCode
	 */
	public String getResidenceCode() {
		if (residenceCode != null) {
		return residenceCode;
		}else {
			return "";
		}
	}

	/**
	 * @param residenceCode the value of residenceCode will be set
	 */
	public void setResidenceCode(String residenceCode) {
		if (residenceCode != null) {
		this.residenceCode = residenceCode;
		}
	}

	/**
	 * @return the value of gender
	 */
	public String getGender() {
		if (gender != null) {
		return gender;
		}else {
			return "";
		}
	}
	
	/**
	 * @param gender will be set by using this method
	 */
	public void setGender(String gender) {
		if (gender != null) {
		this.gender = gender;
		}
	}

	/**
	 * @return the value of submissionYear
	 */
	public int getSubmissionYear() {
		return submissionYear;
	}

	/**
	 * @param submissionYear will be set by using this method
	 */
	public void setSubmissionYear(int submissionYear) {
		if (submissionYear > 0) {
		this.submissionYear = submissionYear;

		}
	}

	/**
	 * @return the value of adminViaAmbulance
	 */
	public String getAdminViaAmbulance() {
		if (adminViaAmbulance != null) {
		return adminViaAmbulance;
		}else {
			return "";
		}
	}

	/**
	 * @param adminViaAmbulance value will be set after using this method
	 */
	public void setAdminViaAmbulance(String adminViaAmbulance) {
		if (adminViaAmbulance != null) {
		this.adminViaAmbulance = adminViaAmbulance;
		}
	}

	/**
	 * @return the value of registrationDate
	 */
	public int getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate will be set by using this method
	 */
	public void setRegistrationDate(int registrationDate) {
		if (registrationDate > 0) {
		this.registrationDate = registrationDate;
		}
	}

	/**
	 * @return the value of registrationTime
	 */
	public int getRegistrationTime() {
		return registrationTime;
	}

	/**
	 * @param registrationTime will be set by using this method
	 */
	public void setRegistrationTime(int registrationTime) {
		if (registrationTime > 0) {
		this.registrationTime = registrationTime;
		}
	}
	/**
	 * @return The BirthDate object representing the patient's birth date.
	 */
	public BirthDate getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate The BirthDate object representing the patient's birth date to be set.
	 */
	public void setBirthDate(BirthDate birthDate) {
		if (birthDate != null) {
		this.birthDate = birthDate;
		}
	}


	/**
	 * 
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	@Override
	public String toString() {
		
		return getClass().getName() + "[reportingFacilityProvince=" + reportingFacilityProvince + ", institutionNumber=" + institutionNumber + ", encounterSequence=" + encounterSequence +
				", healthCareNumber=" + healthCareNumber + ", chartNumber=" + chartNumber +  ", issuingProvince=" + issuingProvince + ", residenceCode=" + residenceCode +  ", gender=" + gender + 
				", submissionYear=" + submissionYear + ", adminViaAmbulance=" +adminViaAmbulance + ", registrationDate=" + registrationDate +  ", registrationTime=" + registrationTime + "]";
		
	}
	
	
	
	
	
	
	
	
}
