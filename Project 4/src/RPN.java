/**
 * @author Tien Thuy Ho
 * @version 1.2, 12 October 2014
 * This program creates a RPN class 
 * that extends the myStack class.  
 * This class performs RPN calculation using a stack data structure.
 */

import java.util.Scanner;

public class RPN extends myStack {
	private double answer;
	private String[] input;
	
	/**
	 * Default constructor that calls the constructor of the myStack class.
	 */
	public RPN () {
		super();
		answer = 0;
	}
	
	/**
	 * Reads and splits the input delimited by a space.
	 */
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);
		String expression = keyboard.nextLine();
		input = expression.split(" ");
	}
	
	/**
	 * Calculates a RPN expression if there are at least two elements in the stack.
	 * Throws an exception if the RPN expression is invalid.
	 * Throws an exception for division by 0.
	 */
	public void calculate () throws InvalidExpressionException, DividedByZero {
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("+")) { 
				if (size() >= 2) 
					push(pop() + pop());
				else
					throw new InvalidExpressionException();
			}

			else if (input[i].equals("-")) {
				if (size() >= 2) 
					push(subtract(pop(),pop()));
				else
					throw new InvalidExpressionException();
			}

			else if (input[i].equals("*")) {
				if (size() >= 2)
					push(pop() * pop());
				else
					throw new InvalidExpressionException();
			}

			else if (input[i].equals("/")) {
				if (size() >= 2) {
					if (peek() != 0) 
						push(divide(pop(),pop()));
					else 
						throw new DividedByZero();
				}
				
				else {
					throw new InvalidExpressionException();
				}
			}
			
			else {
				push(Integer.parseInt(input[i]));
			}		
		}
	}
	
	/**
	 * Precondition: x1 and x2 are integers.
	 * Subtracts x1 from x2.  
	 */
	public int subtract(int x1, int x2) {
		return (x2 - x1);
	}
	
	/**
	 * Precondition: x1 and x2 are integers.
	 * Divides x2 by x1.
	 */
	public int divide(int x1, int x2) {
		return (x2/x1);
	}
	
	/**
	 * Prints the final value of the expression.
	 */
	public void print() {
		if (size() == 1) {
			answer = pop();
			System.out.println("The value to your RPN expression: " + answer);
		}
		else {
			System.out.println("There are uncalculated elements.");
		}
	}
	
	/**
	 * Tests the program.
	 */
	public static void main (String[] args) {
		try {
			RPN exp1 = new RPN();
			System.out.println("Enter a valid RPN expression: ");
			exp1.readInput();
			exp1.calculate();
			exp1.print();
		}
		catch (InvalidExpressionException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch (DividedByZero e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}

