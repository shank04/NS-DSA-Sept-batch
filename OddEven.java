import java.util.*; 

class OddEven {

	public static void main(String args[]) {

		System.out.println("Enter any number:");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// if (n % 2 == 0) { // 1 == 0
		// 	// number is even
		// 	System.out.println("You entered an even number");
		// }
		// else if (n % 2 != 0) {
		// 	// number is odd
		// 	System.out.println("You entered an odd number");
		// }

		n % 2 == 0 ? System.out.println("You entered an even number"); : System.out.println("You entered an odd number");

	}
}

// 5