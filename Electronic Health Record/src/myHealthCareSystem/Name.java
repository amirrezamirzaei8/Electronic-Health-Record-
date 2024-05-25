package myHealthCareSystem;

/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/**
 * This class represents the main information of a patient.
 * 
 */
public class Name {
	/*	TODO:	Implement this class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */
	
	
	/**
	 * Declaring the class-level first
	 */
	private static String first;
	/**
	 * Declaring the class-level last
	 */
	private static String last;
	/**
	 * Declaring the class-level middle
	 */
	private static String middle;
	/**
	 * Declaring the class-level salutation
	 */
	private String salutation;
	
	/**
	 * Creating the constructors and using constructor chaining 
	 */
	public Name() {
		this(first,last,middle);
	}
	public Name(String name) {
		String [] nameWComma = name.split(",");
		String [] nameWSpace = name.split(" ");
		middle = "";
		if( nameWComma.length == 2) {
			last = nameWComma[0];
			first = nameWComma[1];
		}
		if(nameWSpace.length == 2) {
			first = nameWSpace[0];
			last = nameWSpace[1];
		}
	}
	public Name(String first, String last) {
		this(first,last,middle);
		middle = "";
	}
	public Name(String first,String last,String middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}

/**
 * Creating Setters for the class-level variables
 * @param first To set the value of the class-level variable first
 */
	public void setFirst(String first) {
		if(first != null) {
		this.first = first;
		}
	}
/**
 * 
 * @param last To set the value of class-level variable last
 */
	public void setLast(String last) {
		if (last != null) {
		this.last = last;
		}
	}
	/**
	 * 
	 * @param middle  To set the value of class-level variable middle
	 */
	public void setMiddle(String middle) {
		if (middle != null) {
		this.middle = middle;
		}
	}
	/**
	 * 
	 * @param salutation  To set the value of class-level variable salutation
	 */
	public void setSalutation(String salutation) {
		if(salutation != null) {
		this.salutation = salutation;
		}
	}
	
	/**
	 * Creating Getters for the class-level variables
	 * @return the value of first
	 */
	public String first() {
		if(first != null) {
		return first;
		}else {
			return "";
		}
	}
	/**
	 * 
	 * @return the value of last
	 */
	public String last() {
		if(last != null) {
		return last;
		}else {
			return "";
		}
	}
	
	

	/**
	 * 
	 * @return the formattedName as first + middle + last + salutation
	 */
	public String formattedName() {
		if(salutation == null) {
		return  first + " " + middle+ " " + last;
		}else {
			return salutation + "." + first + " " + middle + " " + last; 
		}
	}
	/**
	 * Convert this objectd into a meaningful string.
	 * @return this object as a string.
	 */
	@Override
	public String toString() {
		
		return getClass().getName() + "[first=" + first + ", last=" + last + ", middle=" + middle + ", salutation=" + salutation + "]";
	
	}
	

	

}




















