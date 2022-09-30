import java.util.*; 

class PrintDay {

	public static void main(String args[]) {

		System.out.println("Enter any number:");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// we have to print different values for each n
		switch (n) { // here we run switch case over different values of n
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("You have entered a number outside of 1 to 7");
				break;
		}

	}
}