import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		float Fahrenheit, Celsius;
		Fahrenheit = Celsius = 0;//initializes all the variables with the same primitive type
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Please enter a value in Celsius: ");
		Celsius = keyboard.nextFloat();
		Fahrenheit = C2F(Celsius);
		PrintTemp1(Celsius, Fahrenheit);
		
		System.out.print("Please enter a value in Fahrenheit: ");
		Fahrenheit = keyboard.nextFloat();
		Celsius = F2C(Fahrenheit);
		PrintTemp2(Fahrenheit, Celsius);
	}	
		public static float C2F(float Celsius) {
			return ((9.0f/5)*Celsius + 32);//java assumes 9/5, an integer divides another integer, will give an integer
		}
		
		public static float F2C(float Fahrenheit) {
			return ((5.0f/9)*(Fahrenheit - 32));//change the integer into a float
												//only needs to convert one integer because the answer 
												//is forced to the highest precision
			//can be written as (float)5/9 in order to type cast the integer 5 into a float
			//it is important to type cast the integer to another form and vice versa in order to give an accurate answer
		}
		
		public static void PrintTemp1(float Celsius, float Fahrenheit) {
			System.out.println(Celsius + " Celsius is " + Fahrenheit + " in Fahrenheit.");
		}
		
		public static void PrintTemp2(float Fahrenheit, float Celsius) {
			System.out.println(Fahrenheit + " Fahrenheit is " + Celsius + " in Celsius.");
		}
}

