package Project1;

import java.util.Scanner;

public class PassingScalar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] myArray;
		int myScalar;

//		myArray = new int[5];
//		System.out.println("Address of myArray:" + myArray);

//		for (int i = 0; i < myArray.length; i++) {
//			myArray[i] = i;
//		}
		myScalar = 15;
		System.out.println("Initial contents of the scalar.");
		PrintArray(myScalar);
		GetArray(myScalar);
		System.out.println("Final contents of the scalar.");
		PrintArray(myScalar);

	}

	public static void PrintArray(int localScalar) {
		System.out.println("Printing value:");
//		for (int i = 0; i < localArray.length; i++) {
//			System.out.print(localArray[i] + " ");
//		}
		System.out.println(localScalar);
	}

	public static void GetArray(int sourceScalar) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Value of sourceScalar: " + sourceScalar);

//		for (int i = 0; i < sourceArray.length; i++) {
//			System.out.print("Enter element " + i + " :");
//			sourceArray[i] = keyboard.nextInt();
//		}
		System.out.print("Enter an integer value:" );
		sourceScalar = keyboard.nextInt();
	}

}
