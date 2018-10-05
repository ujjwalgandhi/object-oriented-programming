import java.io.*;

class Second{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sum = 0, numInt;
		for (int i=1; i<=10; i++){
			System.out.println("Enter number " + i);
			String num = br.readLine();
			numInt = Integer.parseInt(num);
			sum += numInt;
		}
		System.out.println("Sum of the numbers is " + sum + ".");
	}
}