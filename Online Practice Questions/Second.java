import java.util.*;

abstract class Employee{
	private String name;
	private int number;

	Employee(String n, int nu){
		name = n;
		number = nu;
	}

	String getName(){
		return name;
	}

	int getNumber(){
		return number;
	}

	String toString(){
		return "[Name: " + name + ", Number: " + number + "]";
	}

	abstract double computePay();
}

class Salary extends Employee implements Comparable<Salary>{
	private  double salary;

	Salary(String n, int nu, double s){
		super(n, nu);
		salary = s;
	}

	void setSalary(double s){
		salary = s;
	}

	double getSalary(){
		return salary;
	}

	double computePay(){
		return salary/52;
	}

	int compareTo(Salary s){
		if (this.computePay()>s.computePay()) return 1;
		if (this.computePay()<s.computePay()) return -1;
		return 0;
	}
}

class Second{
	public static void main(String[] args) {
		LinkedList<Salary> list = new LinkedList<Salary>();
		list.add(new Salary) 
	}
}