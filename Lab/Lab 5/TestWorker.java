public class TestWorker {
	public static void main(String[] args) {
		Worker f1 = new FullTimeWorker("Burhan", 100, 160);
		Worker h1 = new HourlyWorker("Ujjwal", 50, 45);
		System.out.println(f1.computePay());
		System.out.println(h1.computePay());
	}

}
