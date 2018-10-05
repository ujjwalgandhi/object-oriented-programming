class testing{
	private static String[] String = {"Ujjwal", "Gandhi"};
	static {
		System.out.println("1.%");
	}

	public static void main(String args) {
		System.out.println("2.@");
	}
	static {
		System.out.println("3.&");
	}
	static {
		Stest.main(String);
		testing.main(String[0]);
		System.out.println("4.~");
	 }
	 static {
	 System.out.println("5.$");
	 }
}

class Stest{
public static void main(String[] args) {
	testing t1 = new testing();
	testing.main(args[0]);
	testing.main(new String());
	 System.out.println("6.#");
	}
}

