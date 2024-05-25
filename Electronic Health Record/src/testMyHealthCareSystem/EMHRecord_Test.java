package testMyHealthCareSystem;

/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/*		@(#)EMHRecord_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
	
	EMHRecord result;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		result =  new EMHRecord(null, null, null, null);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
		result = null;
	}

	/*		Methods to test
	 * 
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMHRecord result = null;
			assertNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		  @Test
		    @Order(2)
		    @DisplayName("EMHRecord() test with Valid arguments")
		    final void testEMHRecordWithValidArguments() {
		       result = new EMHRecord("Ontario", "123", "456", "789");
		        assertNotNull(result,"The overloaded constructor is not working");
		        result = null;
		    }
		}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new EMHRecord(null, null, null, null);
			String expected = "myHealthCareSystem.EMHRecord[reportingFacilityProvince=null, institutionNumber=null, encounterSequence=0, healthCareNumber=null, chartNumber=null, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, adminViaAmbulance=null, registrationDate=0, registrationTime=0]";
			String actual = result.toString();
            assertEquals(expected, actual ,result.toString());
		}
	}

	
	/*
	 * TODO: Add code to test one set method and one get method
	 */
	
	@Nested	@DisplayName("setgender() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetGenderTest {
		@Test @Order(1) @DisplayName("setGender()")
		final void testSetGender() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new EMHRecord(null, null, null, null);
			result.setGender("Male");
			String expectedValue = "Male";
			String actualValue = result.getGender();
			assertEquals(expectedValue,actualValue,"The setGender() method is not working");
			result = null;
		}	
	}
	@Nested	@DisplayName("GetGender() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetGenderTest {
		@Test @Order(1) @DisplayName("GetGender()")
		final void testGetGender() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new EMHRecord(null, null, null, null);
			result.setGender("Female");
			String expectedValue = "Female";
			String actualValue = result.getGender();
			assertEquals(expectedValue,actualValue,"The getGender() method is not working");
			result = null;
		}	
	}


}
