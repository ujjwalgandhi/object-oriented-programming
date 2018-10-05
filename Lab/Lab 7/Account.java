public class Account {
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account(long a, double b, String n){
		acctNumber = a;
		balance = b;
		name = n;
	}

	public long getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "[A/C: " + acctNumber + ", Bal: " + balance + ", Name: " + name + "]";
	}
}
