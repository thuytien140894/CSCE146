package Project1;


import java.util.Scanner;
public class Array {
	//Array is considered an object because it has methods associated with it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Array1 = new int [5];
		int [] Array2 = new int [10];
		
		for (int i = 0; i < Array1.length; i++) {
			Array1[1] = i; //declares an array
		}
		
		public static void printArray (int[] anArray) {
			for (int i = 0; i < anArray.length; i++) {
				System.out.println(anArray[i] + " ");
			}
		}
		
		public static void readArray (int[] anArray) {
			Scanner keyboard = new Scanner(System.in);
			
			for (int i = 0; i < anArray.length; i++) {
				anArray[i] = keyboard.nextInt();
			}
		}
		
		int[][] myArray;
		myArray = new int[20][20]; 
		
		/*when two arrays are set equal to each other, they point to the same memory allocation (block of data).
		 * In other words, they point to the same starting index.  This does not mean that they have the same content.  
		 * Therefore, whatever changes to one array impacts the other as well.
		 * 
		 * If one array argument is passed to another, they point to the same chunk of memory.  
		 * There is no need for data transfer.
		 */
		
		public static void copyArray (int[] array1, int[] array2) {
			if (array1.length == array2.length) {
				for (int i = 0; i< array1.length; i++) {
					array1[i] = array2[i];
				}
			}
		}
		
	}

}
