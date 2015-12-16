/**
 * @author Tien Thuy Ho
 * @version 1.2, 12 October 2014
 * This program defines an exception for division by 0.
 */
public class DividedByZero extends Exception {
	
	/**
	 * Default constructor.
	 */
	public DividedByZero () {
		super ("Division by 0!");
	}
	
	/**
	 * Precondition: message is a String value.
	 * Constructor to define the exception.
	 */
	public DividedByZero (String message) {
		super(message);
	}
}