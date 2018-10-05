import java.util.Scanner;

class Fourth {
	public static void main(String args[]){
		//variable declaration
		int sum = 0, num;
		Scanner in = new Scanner(System.in);
		for (int i=1; i<=10; i++){
			System.out.print("Enter number " + i + ": ");
			num =  in.nextInt();
			sum += num;
		}
		System.out.println("The sum is " + sum + ".");
	}// End of main() method
}