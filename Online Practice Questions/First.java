import java.util.*;

class Student{
	public String name;
	public double cgpa;

	Student(String s, double c){
		name = s;
		cgpa = c;
	}

	public String toString(){
		return("[Name: " + name + ", CGPA: " + cgpa + "]");
	}
}

class cgCompare implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if (s1.cgpa>s2.cgpa) return -1;
		if (s1.cgpa<s2.cgpa) return 1;
		return s1.name.compareTo(s2.name);
	}
}

class First{
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Ujjwal", 8.75));
		al.add(new Student("Rohit", 9.5));
		al.add(new Student("Valay", 8.75));
		al.add(new Student("Burhan", 9.00));
	
		cgCompare cgComp = new cgCompare();
		Collections.sort(al, cgComp);

		for(Student s:al)
			System.out.println(s);
	}
}