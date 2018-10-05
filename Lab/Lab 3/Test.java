/*class Test {
	static int x = 10;
	public static void main(String[] args){
		System.out.println(x);
	}
	static{ System.out.print(x + " "); }
}*/

class Test{
	static int y;
	int z;
	public static void main(String[] args) {
		System.out.println(method1());
		//System.out.println(y);
	}
	
	public static int method1(){
		//static int x; Can't create a local static variable
		//Cannot modify the variables
		return y;
		//return x++;
	}
}