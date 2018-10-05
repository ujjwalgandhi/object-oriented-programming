import java.util.*;

public class Bank {
	private ArrayList<Account> accts;
	int maxActive;
	
	public Bank(){
		accts = new ArrayList<Account>();
	}
	
	public boolean addAccount(Account newone){
		// if (accts.size()==0){
		// 	accts = new ArrayList<Account>();
		// 	accts.add(newone);
		// 	return true;
		// }
		if (accts.size()<=30){
			accts.add(newone);
			return true;
		}
		return false;
	}
	
	public boolean removeAccount(long acctnum){
		Iterator<Account> itr = accts.iterator();
		while (itr.hasNext()){
			Account next = itr.next();
			if (next.getAcctNumber() == acctnum){
				accts.remove(next);
				return true;
			}
		}
		return false;
	}
	
	public double deposit(long acctnum, double amount){
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()){
			Account next = itr.next();
			if(next.getAcctNumber() == acctnum){
				double bal = next.getBalance();
				next.setBalance(amount + bal);
				return 0;
			}
		}
		return -1;
	}
	
	public double withdraw(long acctnum, double amount){
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()){
			Account next = itr.next();
			if(next.getAcctNumber() == acctnum){
				double bal = next.getBalance();
				if (bal>amount){
					next.setBalance(bal-amount);
					return 0;
				}
			}
		}
		return -1;
		}
	
	public String toString(){
		String list="";
		Iterator<Account> itr = accts.iterator();
		while (itr.hasNext())
			list = list + itr.next().toString() + "\n";
		return list;
	}
}
