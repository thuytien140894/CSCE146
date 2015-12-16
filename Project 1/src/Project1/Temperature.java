package Project1;

public class Temperature {
	private double Celsius; //it is good to declare variables as private --> safer for the program
	private double Fahrenheit;//cannot be accessed by other classes
	
	public Temperature() { //default constructor
		Celsius = Fahrenheit = 0;
	}
	
	public Temperature(double C, double F) {
		Celsius = C;
		Fahrenheit = F;
	}
	
	public void F2C() { //returns nothing
		Celsius = ((5.0/9)*(Fahrenheit -32));
	}
	
	public void C2F() { //returns nothing
		Fahrenheit = ((9.0/5*Celsius) - 32);
	}
	
	public double getCelsius() { //getter
		return Celsius;
	}
	
	public void setCelsius(double celsius) { //setter
		Celsius = celsius;
	}
	
	public double getFahrenheit() {
		return Fahrenheit;
	}
	
	public void setFahrenehit(double fahrenheit) {
		Fahrenheit = fahrenheit;
	}
}
