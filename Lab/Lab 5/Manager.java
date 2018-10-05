public class Manager extends Employee{
	private String department;
	
	Manager(String n, double s, String d){
		super(n,s);
		department = d;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString(){
		return "[Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + department + "]";
	}
}
