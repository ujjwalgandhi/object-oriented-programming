import java.util.*;

public class TestStudentList {
	public static void main(String[] args) {
		ArrayList studentList = new ArrayList();
		
		studentList.add(new Student("Ramesh","Male",18));
		studentList.add(new Student("Reeta","Female",19));
		studentList.add(new Student("Seema","Female",18));
		studentList.add(new Student("Suresh","Male",20));
		
		System.out.println("Original contents of studentList: ");
		
		Iterator itr = studentList.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.print(element +"\n");
		}
		System.out.println();
		
		ListIterator litr = studentList.listIterator();
		while (litr.hasNext()){
			Student element = (Student)litr.next();
			if (element.getGender().equals("Male"))
				element.setName("Mr. " + element.getName());
			else
				element.setName("Ms. " + element.getName());
			litr.set(element);
		}
		
		System.out.println("Modified contents of studentList: ");
		itr = studentList.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			System.out.print(element+"\n");
		}
		System.out.println();
		
		System.out.println("Modified list backwards: ");
		while (litr.hasPrevious()){
			Object element = litr.previous();
			System.out.print(element+"\n");
		}
		System.out.println();
	}
}
