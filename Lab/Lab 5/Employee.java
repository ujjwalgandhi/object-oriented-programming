class Employee{
	private String name;
	private double salary;
	
	Employee(String n, double s){
		name = n;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return "[Name: " + name + ", Salary: " + salary + "]";
	}
}