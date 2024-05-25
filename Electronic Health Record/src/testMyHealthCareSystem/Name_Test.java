package testMyHealthCareSystem;

/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/*		@(#)Name_Test.java	Jan. 31, 2024
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
* Test class for testing the Name class
* Uses JUnit version 5
* @author Amirreza Mirzaei
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {
	
	Name result;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
		result = new Name();
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
			+Name(...)
			+toString():String
			+formattedName():String
			+setFirst(first:String):void
			+setLast(last:String):void
			+setMiddle(middle:String):void
			+setSaluation(salutation:String):void
			+first():String
			+last():String
	 */
	
	@Nested	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test @Order(1) @DisplayName("Name() test with Null arguments")
		final void testNameWithNullArguments() {
			Name result = new Name();
			assertNotNull(result);
		}
		/*
		 * TODO: Add code with assertion to test overloaded constructors as you see fit
		 */
		final void testNameWithOverLoadedConstructors() {
			result = new Name("Amir","Mirzaei","Reza");
			assertEquals("Amir", result.first());
            assertEquals("Mirzaei", result.last());
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
			  Name name = new Name("Amir", "Mirzaei", "Reza");
		        name.setSalutation("Mr.");
		        String actualToString = name.toString();
		        String expectedToString = "myHealthCareSystem.Name[first=Amir, last=Mirzaei, middle=Reza, salutation=Mr.]";
		        assertEquals(expectedToString, actualToString,"The toString()is not working properly");
		}
	}
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name("Amir","Mirzaei","Reza");
			result.setSalutation("Mr");
			String expectedValue = "Mr.Amir Reza Mirzaei";
			String actualValue = result.formattedName();
			assertEquals(expectedValue,actualValue,"The formattedName()is not working properly");
		}
		
	}

	@Nested	@DisplayName("setFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test @Order(1) @DisplayName("setFirst()")
		final void testSetFirst() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name();
			result.setFirst("Amir");
			String expectedValue = "Amir";
			String actualValue = result.first();
			assertEquals(expectedValue,actualValue,"The setFirst() method is not working");
			result = null;
		}	
	}
	
	@Nested	@DisplayName("setLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test @Order(1) @DisplayName("setLast()")
		final void testSetLast() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name();
			result.setLast("Mirzaei");
			String expectedValue = "Mirzaei";
			String actualValue = result.last();
			assertEquals(expectedValue,actualValue,"The setLast() method is not working");
			result = null;
		}	
	}

	@Nested	@DisplayName("setMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test @Order(1) @DisplayName("setMiddle()")
		final void testMiddle() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name();
			result.setMiddle("Reza");
			String expectedValue = "Reza";
			String actualValue = "Reza";
			assertEquals(expectedValue,actualValue,"The setMiddle() method is not working");
			result = null;
			
		}	
	}

	
	@Nested	@DisplayName("setSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test @Order(1) @DisplayName("setSalutation()")
		final void testSetSalutation() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name();
			result.setSalutation("Mr.");
			String expectedValue = "Mr.";
			String actualValue = "Mr.";
			assertEquals(expectedValue,actualValue,"The setSalutation() method is not working");
			result = null;
		}
	}
	
	@Nested	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
		@Test @Order(1) @DisplayName("first()")
		final void testFirst() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name();
			result.setFirst("Amir");
			String expectedValue = "Amir";
			String actualValue = result.first();
			assertEquals(expectedValue,actualValue,"The first() method is not working");
			result = null;
		}
	}


	@Nested	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
		@Test @Order(1) @DisplayName("last()")
		final void testlast() {
			/*
			 * TODO: Add code with assertion to test
			 */
			result = new Name();
			result.setLast("Mirzaei");
			String expectedValue = "Mirzaei";
			String actualValue = result.last();
			assertEquals(expectedValue,actualValue,"The last() method is not working");
			result = null;
		}
	}
	

}
