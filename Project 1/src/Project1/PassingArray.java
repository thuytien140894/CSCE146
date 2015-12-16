package Project1;

import java.util.Scanner;

public class PassingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray;

		myArray = new int[5];
		System.out.println("Content of myArray:" + myArray);

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}
		System.out.println("Initial contents of the array.");
		PrintArray(myArray);
		GetArray(myArray);
		System.out.println("Final contents of the array.");
		PrintArray(myArray);
		System.out.print(myArray);

	}

	public static void PrintArray(int[] localArray) {
		System.out.println("Printing array:");
		for (int i = 0; i < localArray.length; i++) {
			System.out.print(localArray[i] + " ");
		}
		System.out.println();
	}

	public static void GetArray(int[] sourceArray) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Content of sourceArray: " + sourceArray);
		
		for (int i = 0; i < sourceArray.length; i++) {
			System.out.print("Enter element " + i + " :");
			sourceArray[i] = keyboard.nextInt();
		}
	}

}

