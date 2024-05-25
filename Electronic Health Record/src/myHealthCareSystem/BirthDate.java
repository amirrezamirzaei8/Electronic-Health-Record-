package myHealthCareSystem;

/**
* @author Amirreza Mirzaei
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/
/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 */
public class BirthDate {
	/** FINAL Birth day															*/
	private final int DAY;
	/** FINAL Birth month.														*/
	private final int MONTH;
	/** FINAL Birth year.														*/
	private final int YEAR;	
	
	
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day	Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.DAY = day;
		this.MONTH = month;
		this.YEAR = year;
	}
	
	
	/*	Accessors			************************************/
	/**
	 * Create getters for the variables
	 * @return this will return the value of DAY
	 */
	public int	getDay(){
		return DAY;
		}
	/**
	 * @return this will return the value of MONTH
	 */
	public int	getMonth(){
		return MONTH;
	}
	/**
	 * @return this will return the value of YEAR
	 */
	public int	getYear(){
		return YEAR;
	}
	
	

	/**
	 * This class does not have setters since the variables are declared as final.
	 */

	/**
	 * @return this method will return the formatted date in this order: YEAR/MONTH/DAY
	 */
	public String formattedBirthDate()	{
		/*	TODO:	write the code to return a formatted string for the birth date in the format
		 * 		yyyy/mm/dd
		 */
		if(YEAR != 0 && MONTH != 0 && DAY != 0) {
		return this.YEAR + "/" + this.MONTH + "/" +this.DAY;
		}else {
			
		return "";
		}
	}


	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	@Override
	public String toString()	{
		return getClass().getName() + "[year=" + YEAR + ", month=" + MONTH + ", day=" + DAY + "]"; 
	}
	
	/*	Helper Methods		************************************/

}
