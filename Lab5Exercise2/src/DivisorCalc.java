
public class DivisorCalc {

	public static void main(String[] args) {
		// Lewis University Programming Fundamentals Lab 5 Exercise 3
		// Brent Harshbarger
		
		int gcd1 = DivisorCalc.gcd(16, 4);
		System.out.println("16 and 4 should have produced 4. Actually produced: " + gcd1);

		int gcd2 = DivisorCalc.gcd(9, 81);
		System.out.println("9 and 81 should have produced 9. Actually produced: " + gcd2);

		int gcd3 = DivisorCalc.gcd(9, 39);
		System.out.println("9 and 39 should have produced 3. Actually produced: " + gcd3);
	}

	public static int gcd(int num1, int num2) {

		if ((num2 <= num1) && (num1 % num2 == 0)) {
			return num2;
		}

		if (num1 < num2) {
			return gcd(num2, num1);
		}

		return gcd(num2, (num1 % num2));
	}

}
