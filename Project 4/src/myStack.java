/**
 * @author Tien Thuy Ho
 * @version 1.2, 12 October 2014
 * This program creates a myStack class 
 * that extends the myIntArrayList class.  
 * This class functions similarly to the formal Java Stack class.
 */

public class myStack extends myIntArrayList {
	
	/**
	 * Default constructor that calls the constructor of the myIntArrayList class.
	 */
	public myStack() {
		super();
	}
	
	/**
	 * Precondition: anotherStack is a myStack object.
	 * Calls the copy constructor of the myIntArrayList class.
	 */
	public myStack (myStack anotherStack) {
		super(anotherStack.array);
	}
	
	/**
	 * Precondition: element is an integer.
	 * Pushes an element onto the top of the stack.
	 */
	public void push(int element) {
		add(capacity,element);
	}
	
	/**
	 * Removes and returns the element at the top of the stack.
	 */
	public int pop() {
		return (remove(capacity-1));
	}
	
	/**
	 * Returns the element at the top of the stack without removing it.
	 */
	public int peek() {
		return (get(capacity-1));
	}
	
	/**
	 * Returns the size of the stack.
	 */
	public int size() {
		return capacity;
	}
	
	/**
	 * Tests the program.
	 */
	public static void main(String[] args) {
		myStack s = new myStack();
		s.push(1);
		s.push(2);
		s.push(s.pop() + s.pop());
		s.push(10);
		s.push(s.pop() * s.pop());
		System.out.println(s.pop());
	}
}
