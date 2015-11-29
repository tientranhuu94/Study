class ifControl {
	public static void main(String args[]) {
		int a, b, c;
		a = 2;
		b = 4;
		if (a < b) System.out.println("a is less thab b!");

		if (a == b) System.out.println("you won't see this");
		System.out.println();

		c = a - b;
		if (c >= 0) {
			System.out.println("c is non-negative");
		} else {
			System.out.println("c is negative");
		}

		System.out.println();
	}
}