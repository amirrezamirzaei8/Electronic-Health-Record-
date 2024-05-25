package testMyHealthCareSystem;
/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/

/*		@(#)BirthDate_Test.java	Jan. 31, 2024
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
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {
	BirthDate result;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		result = new BirthDate(2024,02,14);
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
		+BirthDate(day:int, month:int, year:int)
		+toString():String
		+formattedBirthDate():String
		+getDay():int
		+getMonth():int
		+getYear():int
	 */

	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with Null arguments")
		final void testBirthDateWithNullArguments() {
			BirthDate result = new BirthDate(0,0,0);
			assertNotNull(result);
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		@Test
	    @Order(1)
	    @DisplayName("Constructor with valid arguments")
	    final void testConstructorWithValidArguments() {
	        result = new BirthDate(2000, 12, 31);
	        assertNotNull(result);
	        assertEquals(2000, result.getYear());
	        assertEquals(12, result.getMonth());
	        assertEquals(31, result.getDay());
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
			 BirthDate birthDate = new BirthDate(2000, 12, 31);
		        assertEquals("myHealthCareSystem.BirthDate[year=2000, month=12, day=31]", birthDate.toString(),"The toString() method is not working");
		}
	}
	
	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new BirthDate(2004,01,05);
			String expectedValue = "2004/1/5";
			String actualValue = result.formattedBirthDate();
			assertEquals(expectedValue,actualValue,"The formattedBirthDate() method is not working");
			result = null;
		}
		
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new BirthDate(2004,01,05);
			int expectedValue = 5;
			int actualValue = result.getDay();
			assertEquals(expectedValue,actualValue,"The getDay() method is not working");
			result = null;
			
		}	
	}
	
	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new BirthDate(2004,01,05);
			int expectedValue = 1;
			int actualValue = result.getMonth();
			assertEquals(expectedValue,actualValue,"The getMonth() method is not working");
			result = null;
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new BirthDate(2004,01,05);
			int expectedValue = 2004;
			int actualValue = result.getYear();
			assertEquals(expectedValue,actualValue,"The getYear() method is not working");
			result = null;
		}	
	}

}
