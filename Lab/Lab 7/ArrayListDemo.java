import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList arlTest = new ArrayList();
		System.out.println("Size of ArrayList at creation: " + arlTest.size());
		
		arlTest.add("B");
		arlTest.add("I");
		arlTest.add("T");
		arlTest.add("S");
		System.out.println("Size of ArrayList after adding elements: " + arlTest.size());
		
		System.out.println("List of all elements: " + arlTest);
		
		arlTest.remove("B");
		System.out.println("See contents after removing one element: " + arlTest);
		
		arlTest.remove(2);
		System.out.println("See contents after removing element by index: " + arlTest);
		
		System.out.println("Size of ArrayList after removing elements: " + arlTest.size());
		System.out.println("List of all elements after removing elements: " + arlTest);
		
		System.out.println(arlTest.contains("T"));
	}

}
