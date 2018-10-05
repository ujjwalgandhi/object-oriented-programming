class TaxOnSalary{
	double salary;
	boolean isPANsubmitted;
	double tax;
	
	TaxOnSalary(){
		this.salary = 0.0;
		this.isPANsubmitted = false;
	}
	
	TaxOnSalary(boolean isPANsubmitted){
		this.salary = 1000.00;
		this.isPANsubmitted = isPANsubmitted;
	}
	
	void inputSalary(double salary){
		this.salary = salary;
	}
	
	void calculateTax(){
		if (this.salary<=18000 && this.isPANsubmitted==true)
			tax=0.0;
		if (this.salary<=18000 && this.isPANsubmitted==false)
			tax=0.05*this.salary;
		if (this.salary>18000 && this.salary<=50000)
			tax=0.1*this.salary;
		if (this.salary>50000 && this.salary<=100000)
			tax=0.2*this.salary;
		if (this.salary>100000)
			tax=0.4*this.salary;
	}
}

public class testTax {
	public static void main(String []args){
		TaxOnSalary t1 = new TaxOnSalary();
		t1.inputSalary(30000);
		t1.calculateTax();
		TaxOnSalary t2 = new TaxOnSalary();
		t2.inputSalary(10000);
		t2.calculateTax();
		System.out.println("Your tax is " + t1.tax);
		System.out.println("Your tax is " + t2.tax);
	}
}
