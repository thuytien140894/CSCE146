/**
 * @author Tien Thuy Ho
 * @version 1.2, 14 September 2014
 * This program calculates the left and right Riemann sums for a quadratic function. 
 */
import java.util.Scanner;

public class Quadratic {
	private double a, b, c;
	private double width;
	private double[] xValues, yValues;
	
	/**
	 * Default constructor
	 */
	public Quadratic() {
		a = 1;
		b = 2;
		c = 1;
	}
	
	/**
	 * Precondition: _a, _b, _c are double values.
	 * Sets the three coefficients of a quadratic function to _a, _b, _c.
	 */
	public Quadratic(double _a, double _b, double _c) {
		this.a = _a;
		this.b = _b;
		this.c = _c;
	}
	
	/**
	 * Precondition: _a is a double.
	 * Sets the first coefficient to _a.
	 */
	public void set_a (double _a) {
		this.a = _a;
	}
	
	/**
	 * Precondition: _b is a double.
	 * Sets the second coefficient to _b.
	 */
	public void set_b (double _b) {
		this.b = _b;
	}
	
	/**
	 * Precondition: _c is a double.
	 * Sets the third coefficient to _c.
	 */
	public void set_c (double _c) {
		this.c = _c;
	}
	
	/**
	 * Returns the first coefficient a.
	 */
	public double get_a () {
		return a;
	}
	
	/**
	 * Returns the second coefficient b.
	 */
	public double get_b () {
		return b;
	}
	
	/**
	 * Returns the third coefficient c.
	 */
	public double get_c () {
		return c;
	}
	
	/**
	 * Precondition: x is a double.
	 * Calculates the value of the function at x.
	 */
	public double evaluate (double x) {
		return a*Math.pow(x, 2) + b*x + c;
	}
	
	/**
	 * Precondition: start and end are double, intervals is an nonzero integer.
	 * Calculates the left Riemann sum.
	 */
	public double leftRiemannSum (double start, double end, int intervals) {
		width = (end-start)/intervals;
		xValues = new double[intervals];
		yValues = new double[intervals];
		double sum = 0;
		for (int i = 0; i < xValues.length; i++) {
			xValues[i] = start + width*i;
			yValues[i] = evaluate(xValues[i]);
			sum = sum + yValues[i];
 		}
		
		return width*sum;
	}
	
	/**
	 * Precondition: start and end are double, intervals is an nonzero integer.
	 * Calculates the right Riemann sum.
	 */
	public double rightRiemannSum (double start, double end, int intervals) {
		width = (end-start)/intervals;
		xValues = new double[intervals];
		yValues = new double[intervals];
		double sum = 0;
		for (int i = 0; i < xValues.length; i++) {
			xValues[i] = start + width*(i+1);
			yValues[i] = evaluate(xValues[i]);
			sum = sum + yValues[i];
 		}
		
		return width*sum;
	}
	
	/**
	 * Precondition: start and end are double.
	 * Evaluates the exact integral.
	 */
	public double integrate (double start, double end) {
		return ((a/3)*Math.pow(end,3) + (b/2)*Math.pow(end,2) + c*end)
				-((a/3)*Math.pow(start,3) + (b/2)*Math.pow(start,2) + c*start);
	}

	/**
	 * Executes the program.
	 */
	public static void main (String[] args) {
		double a, b, c;
		double start;
		double end;
		int intervals;
		double leftRiemannSum, rightRiemannSum, exactIntegral;
		int[] space = new int [2]; //creates an array to store the indices of spaces that appear in the input. 
		int j = 0;
		
		System.out.println("Enter the three coefficients of a quadratic function separated with spaces:");
		Scanner keyboard = new Scanner(System.in);
		String input1 = keyboard.nextLine();

		/* loops through the input to locate spaces and stores their indices */
		for (int i = 0; i < input1.length(); i++) { 
			if (input1.charAt(i) == ' ') {
				space[j] = i;
				j++;
			}
		}

		/* retrieves the values of coefficients and converts them to doubles */
		a = Double.parseDouble(input1.substring(0,space[0]));
		b = Double.parseDouble(input1.substring(space[0]+1,space[1]));
		c = Double.parseDouble(input1.substring(space[1]+1));

		do {
			System.out.println("Enter the start point and end point of the integration separared with a space: ");
			String input2 = keyboard.nextLine();
			start = Double.parseDouble(input2.substring(0,input2.indexOf(' ')));
			end = Double.parseDouble(input2.substring(input2.indexOf(' ')+1));
		} while (end < start); //asks the user to enter the intervals again if the start point is greater than the end point
			
		do {
			System.out.println("Enter the number of partitions of the integration: ");
			intervals = keyboard.nextInt();
		} while (intervals <= 0); //asks the user to enter the number of partitions again if it is less than or equal to 0 
		
		
		//Calculates the integral
		Quadratic integral = new Quadratic(a, b, c);
		leftRiemannSum = integral.leftRiemannSum(start, end, intervals);
		rightRiemannSum = integral.rightRiemannSum(start, end, intervals);
		exactIntegral = integral.integrate(start, end);
		
		//Prints the results
		System.out.println();
		System.out.println("Interval: [" + start + "," + end + "]");
		System.out.println("Partitions: " + intervals);
		System.out.println("Left Riemann Sum: " + leftRiemannSum);
		System.out.println("Right Riemann Sum: " + rightRiemannSum);
		System.out.println("Exact Integral: " + exactIntegral);
		
		System.exit(0);
	}
}

