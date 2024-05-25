package testMyHealthCareSystem;
/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/

/*		@(#)Address_Test.java	Jan. 31, 2024
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
* Test class for testing the Address class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {

	Address result;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		result = new Address(null, null, null, null, null);
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
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address result = new Address(null, null, null, null, null);
			assertNotNull(result);
			result = null;
		}
		
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		final void testNameWithOverLoadedConstructors() {
			result = new Address("Algonquin","10","Ottawa","Canada","SR7");
			assertEquals("Algonquin", result.street());
            assertEquals("SR7", result.postalCode());
            assertEquals("Ottawa", result.getCity());
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
			Address address = new Address("123 Main St", "Apt 4", "Anytown", "USA", "12345");
	        assertEquals("myHealthCareSystem.Address[street=123 Main St, number=Apt 4, city=Anytown, country=USA, postalCode=12345]", address.toString());
	        address = null;
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			/*
			 * TODO: Add code with assertion to test
			 */
			  result = new Address("1711 Richmonhill", "Apt10", "Toronto", "Canada", "K2C");
			  String expectedValue = "Apt101711 RichmonhillTorontoCanadaK2C";
			  String actualValue = result.formattedAddress();
		      assertEquals(expectedValue,actualValue,"The formattedAddress() is not working");
		      result = null;
		}
		
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setPostalCode("CR7");
			String expectedValue = "CR7";
			String actualValue = result.postalCode();
			assertEquals(expectedValue,actualValue,"The postalCode() is not working");
			 result = null;
			
			
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setCity("Shiraz");
			String expectedValue = "Shiraz";
			String actualValue = result.getCity();
			assertEquals(expectedValue,actualValue,"The getCity() is not working");
			 result = null;
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setCity("Shiraz");
			String expectedValue = "Shiraz";
			String actualValue = result.getCity();
			assertEquals(expectedValue,actualValue,"The setCity() is not working");
			 result = null;
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setNumber("888");
			String expectedValue = "888";
			String actualValue = "888";
			assertEquals(expectedValue,actualValue,"The setNumber() is not working");
			 result = null;
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setCity("Shiraz");
			String expectedValue = "Shiraz";
			String actualValue = result.getCity();
			assertEquals(expectedValue,actualValue,"The getCity() is not working");
			 result = null;
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setCountry("Iran");
			String expectedValue = "Iran";
			String actualValue = "Iran";
			assertEquals(expectedValue,actualValue,"The setCountry() is not working");
			 result = null;
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Address(null, null, null, null, null);
			result.setPostalCode("LM10");
			String expectedValue = "LM10";
			String actualValue = result.postalCode();
			assertEquals(expectedValue,actualValue,"The setPostalCode() is not working");
			 result = null;
		}
	}




}
