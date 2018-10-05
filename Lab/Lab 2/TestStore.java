class Item{
	private String itemName = new String();
	private String itemidNo = new String();
	private int itemQuantity;
	private double itemPrice;
	
	Item(String itemName, String itemidNo){
		this.itemidNo = itemidNo;
		this.itemName = itemName;
		this.itemQuantity = 1;
		this.itemPrice = 500;
	}
	
	Item(String itemName, String itemidNo, int itemQuantity){
		this(itemName, itemidNo);
		this.itemQuantity = itemQuantity;
		this.itemPrice = 500;
	}

	Item(String itemName, String itemidNo, int itemQuantity, double itemPrice){
		this(itemName, itemidNo);
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	public void getitemName(){
		System.out.println(itemName);
	}
	
	public void getitemidNo(){
		System.out.println(itemidNo);
	}
	
	public int getitemQuantity(){
		//System.out.println(itemQuantity);
		return itemQuantity;
	}
	
	public double getitemPrice(){
		//System.out.println(itemPrice);
		return itemPrice;
	}
	
	public void setitemName(String itemName){
		this.itemName = itemName;
	}
	
	public void setitemidNo(String itemidNo){
		this.itemidNo = itemidNo;
	}
	
	public void setitemQuantity(int itemQuantity){
		this.itemQuantity = itemQuantity;
	}
	
	public void setitemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}

}


class Customer{
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	Customer(String name, String idNo){
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000;
	}
	
	Customer(String name, String idNo, double balance){
		this(name, idNo);
		this.balance = balance;
	}
	
	void print(){
		item.getitemName();		
		item.getitemidNo();
		item.getitemPrice();
		item.getitemQuantity();
	}
	
	void buyItem(Item item){
		this.item = item;
		if (item.getitemQuantity()<1)
			System.out.println("Order quantity not valid.");
		if (this.balance < (item.getitemQuantity()*item.getitemPrice()))
			System.out.println("Insufficient balance.");
		else {
			balance = balance - (item.getitemQuantity()*item.getitemPrice());
			System.out.println("Order successful! Here are the details:");
			System.out.print("Item name: "); item.getitemName();
			System.out.print("Item ID: "); item.getitemidNo();
			System.out.println("Current balance: " + this.balance);
			}
	}
}

public class TestStore{
	public static void main(String []args){
		Item it1 = new Item("Egg", "EGG123");
		Item it2 = new Item("Bread", "BRE332", 9);
		Customer cu = new Customer("Ujjwal", "2017A7PS0143P");
		cu.buyItem(it1);
		cu.buyItem(it2);
		
	}
}
