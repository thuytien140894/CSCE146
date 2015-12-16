package Project1;

import java.util.Scanner;

public class Conditional {
	public static void main (String[] args) {
		int i = 0, j = 0;
		boolean flag;
		Scanner keyboard = new Scanner (System.in);
		i = keyboard.nextInt();
		j = keyboard.nextInt();
		
		/* if-else statement*/
		flag = (i < 5) && (j >20);//declares the condition first so that it is easier to read given long condition
		if (flag) { //{} creates a block
			System.out.println("Conditions satisfied");
		}
		else {
			System.out.println("Conditions not satisfied");
		}
		
		
		if (i < 0) {
			System.out.println("i < 0");
		}
		else if (i < 10) {
			System.out.println("i >= 0 and i < 10");
		}
		else {
			System.out.println("i >= 10");
		}
		
		/*switch statement*/
		switch (i) {
		case 1: //has to be integers or characters, cannot be double or float
			System.out.println("1");//continues with case 2
		case 2:
			System.out.println("2");
			break;
		case 3:
			break; //if i = 3, nothing is executed.
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("Something here");
			break;
		}
		
		i = 0;
		if ((i != 0) && (5/i == 15)) {
			System.out.println("Do something useful");
		}
		else {
			System.out.println("Do some other thing  that is also useful");
		}
	}
}
