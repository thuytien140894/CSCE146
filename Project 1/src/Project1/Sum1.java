package Project1;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //initializes the sum
		int number = 0;
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter the next number ");
			number = keyboard.nextInt();
			sum += number;
		}
		
		System.out.println("The sum is " + sum);
	}

}
