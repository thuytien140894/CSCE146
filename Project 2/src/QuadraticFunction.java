import java.util.Scanner;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 September 2014
 * This program calculates the solutions to a quadratic function.
 */

public class QuadraticFunction {
	private String s1, s2; 
	private double a, b, c, d;
	
	/**
	 * Precondition: a, b, c are double values.
	 * Sets three coefficients of the quadratic function to a, b, and c.
	 */
	public QuadraticFunction(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = b*b - 4*a*c;
	}
	
	/**
	 * Calculates the solutions for the quadratic function, including both real and imaginary values.
	 */
	public void solve () {
		if (d >= 0) { 
			s1 = "" + (-b + Math.sqrt(b*b - 4*a*c))/(2*a); 
			s2 = "" + (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		}
		else {
			d = Math.sqrt(Math.abs(d))/(2*a);
			s1 = ((-b/(2*a)) + " +i " + d);
			s2 = ((-b/(2*a)) + " -i " + d);
		}
	}
	
	/**
	 * Prints the solutions.
	 */
	public void print () {
		System.out.println("First solution: " + s1);
		System.out.println("Second solution: " + s2);
	}

	/**
	 * Executes the program.
	 */
	public static void main(String[] args) {
		double a, b, c;
		int[] space = new int [2]; //creates an array to store the indices of spaces that appear in the input. 
		int j = 0;
		
		System.out.println("Enter the three coefficients of a quadratic function separated with spaces:");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
		/* loops through the input to locate spaces and stores their indices */
		for (int i = 0; i < input.length(); i++) { 
			if (input.charAt(i) == ' ') {
				space[j] = i;
				j++;
			}
		}
		
		/* retrieves the values of coefficients and converts them to doubles */
		a = Double.parseDouble(input.substring(0,space[0]));
		b = Double.parseDouble(input.substring(space[0]+1,space[1]));
		c = Double.parseDouble(input.substring(space[1]+1));
		
		/* calculates the solutions for the quadratic function using the class QuadraticFunction and its methods */
		QuadraticFunction f1 = new QuadraticFunction(a, b, c);
		f1.solve();
		f1.print();
		
		System.exit(0);
	}
}
