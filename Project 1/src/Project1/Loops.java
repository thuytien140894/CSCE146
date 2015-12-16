package Project1;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) { //declares i here instead of outside the loop lessens the need for memory.
			System.out.println("For loop number: " + i);
		}
		
		int i = 0;//initializes i
		while (i < 10) {//condition
			System.out.println("For loop number: " + i);
			i++;//updated action
		}
		
		i = 0;
		do { //esecutes the loops at least one time
			System.out.print("Do loop number: " + i);
			i++;
		} while (i < 10);
	}
	

}
