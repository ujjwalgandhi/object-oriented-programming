public class BankAccount {
	public static void main(String[] args) {
		Bank LL = new Bank();
		
		LL.addAccount(new Account(20170143, 3000, "Ujjwal"));
		LL.addAccount(new Account(20170105, 5000, "Rohit"));
		LL.addAccount(new Account(20170164, 2000, "Lavanya"));
		LL.addAccount(new Account(20170126, 1500, "Siddhant"));
		LL.addAccount(new Account(20170075, 5000, "Laksh"));
		
		System.out.println(LL);
		
		System.out.println(LL.removeAccount(20170164));
		System.out.println(LL.removeAccount(20170151));
		
		System.out.println(LL);
		
		System.out.println(LL.deposit(20170143, 500));
		System.out.println(LL.deposit(20170151, 500));
		
		System.out.println(LL);
		
		System.out.println(LL.withdraw(20170143, 1000));
		System.out.println(LL.withdraw(20170126, 2000));
		System.out.println(LL.withdraw(20170038, 1000));
		
		System.out.println(LL);
	}
}
