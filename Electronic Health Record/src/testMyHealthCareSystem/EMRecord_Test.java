
package testMyHealthCareSystem;
/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/

/*		@(#)EMRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	EMRecord result;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		result = new EMRecord(null, null, null, null);
		
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
		+EMRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
		+setName(name:Name):void
		+setAddress(address:Address):void
		+setHeight():void
		+getHeight():int
		+setWeight():void
		+getWeight():int
		+formattedName():String
		+formattedAddress():String
		+bmi():int
	 */

	
	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			/*
			 * TODO: Add code with assertion to test constructor\
			 */
			EMRecord result = null;
			assertNull(result);
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
			EMRecord result = new EMRecord("Ontario", "123", "456", "789");
			System.out.println(result.toString());
			 String expectedString = "myHealthCareSystem.EMRecord[reportingFacilityProvince=Ontario, institutionNumber=123, encounterSequence=0, healthCareNumber=789, chartNumber=456, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, adminViaAmbulance=null, registrationDate=0, registrationTime=0]myHealthCareSystem.EMRecord[height=0, weight=0, name=null, address=null]";
		        String actualString = result.toString();
		        assertEquals(expectedString, actualString,"The toString() Method is not working");
		}
	}

	
	/*
	 * TODO: Add code to test one set method and one get method
	 */
	@Nested	@DisplayName("setHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class testSetHeight {
		@Test @Order(1) @DisplayName("setHeight()")
		final void testSetHeight() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new EMRecord(null, null, null, null);
			result.setHeight(195);
			int expectedValue = 195;
			int actualValue = result.getHeight();
			assertEquals(expectedValue,actualValue,"The setHeight() method is not working");
			result = null;
		}	
	}
	@Nested	@DisplayName("getHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class testGetHeight {
		@Test @Order(1) @DisplayName("getHeight()")
		final void testGetHeight() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new EMRecord(null, null, null, null);
			result.setHeight(200);
			int expectedValue = 200;
			int actualValue = result.getHeight();
			assertEquals(expectedValue,actualValue,"The getHeight() method is not working");
			result = null;
		}	
	}
}
