class Variables {

	public static void main(String args[]) {

		// byte z = 124;
		// short x = -200;
		// float y = 12.457889;

		// char c = ' ';

		// boolean b = true;

		// int sum = x + y;

		int t = 6;
		System.out.println(++t); // 7

		int s = 6;
		System.out.println(s++); // 6
		System.out.println(s); // 7


		int m = 6;
		System.out.println(--m); // 5

		int n = 6;
		System.out.println(n--); // 6
		System.out.println(n); // 5

		int r = 10; 
		int test = r++;
		System.out.println(r); // 11
		System.out.println(test); // 10

		int q = 10; 
		int test2 = --q; // test2 = 9
		System.out.println(q); // 9
		System.out.println(test2); // 9


		System.out.println(test2++); // 9
		System.out.println(++test2); // 11

		System.out.println(test2++ + ++test2); // 11 + 13 = 24

		int i = 20;
		System.out.println(--i + ++i); // 19 + 20 = 39

		boolean b = false;
		System.out.println(!b); // true

		int num1 = 10;
		int num2 = 0;
		System.out.println(num1 / num2); // error will be thrown

		System.out.println(num1 % num2); // 1

		float num3 = 10.0f;
		float num4 = 3.0f;
		System.out.printf("%.4f", num3 / num4); // 3.3333


		System.out.print("Hello");

		System.out.print(" World");

		boolean b1 = (10 > 5) && (6 <= 8); // true && true = true

		boolean b2 = (9 == 9.0) || (4 <= 6); // true || true = true

		int num5 = 10;
		num5 += 2; // num5 = num5 + 2
		System.out.println(num5); // 12

		num5 -= 3; // num5 = num5 - 3
		System.out.println(num5); // 9

		num5 %= 2; // num5 = num5 % 2
		System.out.println(num5); // 1

		int a = 5;
		int b = 2;
		int c = 4;

		System.out.println(a + b + c);

	}
}















// those who are not able to hear try to refresh this page, try to rejoin