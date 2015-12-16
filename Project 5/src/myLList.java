public class myLList {
	private Datum root;
	
	public myLList() {
		root = new Datum();
	}
	
	public myLList(int[] anArray) {
		root = new Datum(anArray[0]);
		Datum temp = root;
		for (int i = 1; i < anArray.length; i++) {
			temp.setNextDatum(new Datum(anArray[i]));
			temp = temp.getNextDatum();
		}
		temp = null;
	}
	
	public myLList(myLList anExample) {
		this.root = anExample.root;
	}
	
	public void add(int value) {
		Datum currentNode = root;
		while (currentNode.getNextDatum() != null) {
			currentNode = currentNode.getNextDatum();
		}
		currentNode.setNextDatum(new Datum(value));
	}
	
	public void add(int index, int value) {
		Datum temp = new Datum(value);
		Datum currentNode = root;
		if (index >= size()) {
			add(value);
		}
		else {
			for (int i = 1; i < index; i++) {
				currentNode = currentNode.getNextDatum();
			}

			temp.setNextDatum(currentNode.getNextDatum());
			currentNode.setNextDatum(temp);
			temp = null;
		}
	}
	
	public int remove(int index) {
		Datum currentNode = root;
		Datum removedNode;
		if (index >= size()) {
			removedNode = root;
			root = root.getNextDatum();
		}
		else {
			for (int i = 1; i < index; i++) {
				currentNode = currentNode.getNextDatum();
			}
		}
		
		removedNode = currentNode.getNextDatum();
		currentNode.setNextDatum(removedNode.getNextDatum());
		return removedNode.getContent();
	}
	
	public boolean contains(int value) {
		boolean contains = false;
		if (root.getContent() == value) {
			contains = true;
		}
		
		else {
			for (Datum currentNode = root;
					currentNode.getNextDatum() != null;
					currentNode = currentNode.getNextDatum()) {
				if (currentNode.getNextDatum().getContent() == value) {
					contains = true;
					break;
				}
			}
		}
		if (contains == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		return contains;
	}
	
	public int get(int index) {
		int node = -1;
		int valueAtIndex = 0;
		if (index >= size()) {
			valueAtIndex = root.getContent();
		}
		else {
			for (Datum currentNode = root;
					currentNode.getNextDatum() != null;
					currentNode = currentNode.getNextDatum()) {
				node++;
				if (node == (index-1)) {
					valueAtIndex = currentNode.getNextDatum().getContent();
					break;
				}
			}
		}
		
		return valueAtIndex;
	}
	
	public int indexOf(int value) {
		int node = 0;
		int index = 0;
		if (root.getContent() == value) {
			index = node;
		}
		else {
			for(Datum currentNode = root; 
					currentNode.getNextDatum() != null;
					currentNode = currentNode.getNextDatum()) {
				node++;
				if (currentNode.getNextDatum().getContent() == value) {
					index = node;
				}
			}
		}
		
		return index;
	}
	
	public boolean isEmpty() {
		boolean isEmpty = (root == null);
		if (isEmpty) {
			System.out.print("True");
		}
		else {
			System.out.println("False");
		}
		
		return isEmpty;
	}
	
	public int size() {
		int node = 0;
		for (Datum currentNode = root; 
				currentNode.getNextDatum() != null; 
				currentNode = currentNode.getNextDatum()) {
			node++;
		}
		node++;
		return node;
	}
	
	public void clear() {
		root = null;
	}
	
	public void print() {
		System.out.print(root.getContent() + " ");
		for (Datum currentNode = root;
				currentNode.getNextDatum() != null;
				currentNode = currentNode.getNextDatum()) {
			System.out.print(currentNode.getNextDatum().getContent() + " ");
		}
		System.out.println();
	}
	
	public void copy(myLList anotherLList) {
		this.root = new Datum(anotherLList.root.getContent());
		Datum temp = root;
		for (Datum currentNode = anotherLList.root; 
				currentNode.getNextDatum() != null; 
				currentNode = currentNode.getNextDatum()) {
			temp.setNextDatum(new Datum(currentNode.getNextDatum().getContent()));
			temp = temp.getNextDatum();
		}
		
		temp = null;
	}
	
	public boolean equal(myLList anotherLList) {
		boolean sameSize = (this.size() == anotherLList.size());
		Datum temp1 = this.root;
		Datum temp2 = anotherLList.root;
		boolean sameRoot = (this.root == anotherLList.root);
		int numberOfMatchedElements = 1; // when the two roots are equal.
		boolean sameContent = (numberOfMatchedElements == this.size());
		if (sameSize && sameRoot) {
			for (int i = 1; i < size(); i++) {
				if (temp1.getNextDatum() == temp2.getNextDatum()) {
					numberOfMatchedElements++;
					temp1 = temp1.getNextDatum();
					temp2 = temp2.getNextDatum();
				}
			}
		}
		
		boolean equal = sameSize && sameRoot && sameContent;
		
		if (equal) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		return equal;
		
	}
	
	public Datum getRoot() {
		return root;
	}
	
	public static void main (String[] args) {
		int[] array = {1,2,3};
		myLList l1 = new myLList(array);
		myLList l2 = new myLList(array);
		l2.remove(2);
		l2.getRoot().getNextDatum().setNextDatum(new Datum(9));
		l1.print();
		l2.print();
		l1.equal(l2);
		l1.copy(l2);
		System.out.println(l1.getRoot().getNextDatum());
		System.out.println(l2.getRoot().getNextDatum());
		l1.print();
	}
}
