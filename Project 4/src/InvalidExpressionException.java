/**
 * @author Tien Thuy Ho
 * @version 1.2, 12 October 2014
 * This program defines an exception for an invalid RPN expression.
 */
public class InvalidExpressionException extends Exception {
	
	/**
	 * Default constructor.
	 */
	public InvalidExpressionException () {
		super ("Invalid RPN Expression!");
	}
	
	/**
	 * Precondition: message is a String value.
	 * Constructor to define the exception.
	 */
	public InvalidExpressionException (String message) {
		super(message);
	}
}
