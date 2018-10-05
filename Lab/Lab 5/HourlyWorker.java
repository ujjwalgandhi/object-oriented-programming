public class HourlyWorker extends Worker{
	int hours_worked;
	
	HourlyWorker(String n, double s, int h){
		super(n,s);
		hours_worked = h;
	}
	
	public double computePay(){
		if (hours_worked<=60)
			return hours_worked*getSalary_rate();
		return 0;
	}

}
