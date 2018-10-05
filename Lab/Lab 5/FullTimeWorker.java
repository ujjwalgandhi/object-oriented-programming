public class FullTimeWorker extends Worker{
	int hours_worked;
	
	FullTimeWorker(String n, double s, int h){
		super(n,s);
		hours_worked = h;
	}
	
	public double computePay(){
		if (hours_worked<=240)
			return getSalary_rate()*hours_worked;
		return 0;
	}
}
