
import java.util.ArrayList;
import java.util.Scanner;

package Project1;


public class ArrayList {
	Arraylist<Integer> myArray = new ArrayList<Integer>;//Integer here is a wrapper class.
	//objects cannot be assigned equal to each other using the operator =
	
	for (int i = 0; i < myArray.size(); i++) {
		myArray.add(keyboard.nextInt());
	}
}
	//add(e) 
	//indexOf(Object a): returns the index of the first occurrence of the specified element in this list
	
	System.out.println("How many numbers do you want to enter?");
	int size = keyboard.nextInt();
	
	for (int = 0; i< size; i++) {
		System.out.println("Enter element " + i + ": ");
		myList.add(keyboard.nextInt());
	}
	
	//array: the length of the array cannot be changed after being declared
	//array = new int[1];
	//array = new int[array.length + 1] --> use loops to make the array grow in size, similar to ArrayList
	//expands the original array and copy its original values to the array of a new size.
	/**for (int i = 0; i < size; i++) {
	 * System.out.println("Enter element " + i + ": ");
	 * temp = new int[myList.length + 1];
	 * for (int j = 0; i < myList.length; j++) {
	 * 		temp[i] = myList[i];
	 * }
	 * temp[temp.length - 1] = keyboard.nextInt();
	 * myList = new int[myList.length + 1];
	 * myList = temp; 
	 * 
	 */
	
	myList = add(myList, size);
	public static int[] add(int[] anArray, int anInteger) {
		int[]temp = new int[anArray.length+1];
		
		for (int i = 0; i< anArray.length; i++) {
			temp[i] = anArray[i];
		}
		
		
	}
	
	