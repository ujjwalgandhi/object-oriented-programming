public abstract class Worker {
	private String name;
	private double salary_rate;
	
	Worker(String n, double s){
		name = n;
		salary_rate = s;
	}
	
	public String getName() {
		return name;
	}

	public double getSalary_rate() {
		return salary_rate;
	}

	abstract public double computePay();
}
