import java.util.*;

class FuncDemo {

	// function definition or declaration
	static int calculate (int x) {
		int result = 2 * x + 5;

		return result;
	}

	static int getSum(int a, int b) {
		int sum = a + b;

		return sum;
	}

	static void printSum(int a, int b, int c) {
		int sum = a + b + c;

		System.out.print(sum);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();

		// calling the function
		int result1 = calculate(x1);

		System.out.print(result1);

		System.out.println(getSum(5,  7));

		printSum(9, 0, 1);

	}
}












