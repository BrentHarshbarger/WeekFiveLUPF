
public class StringReversal {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Lab 5 Exercise 4
		// Brent Harshbarger

		String empty = StringReversal.reverseString("");
		System.out.println("Empty string should have produced an empty string. Actually produced: *" + empty + "*");

		String test = StringReversal.reverseString("test");
		System.out.println("test string should have produced tset. Actually produced: *" + test + "*");

		String palindrome = StringReversal.reverseString("racecar");
		System.out.println(
				"racecar (palindrome) string should have produced racecar. Actually produced: *" + palindrome + "*");

		String singleChar = StringReversal.reverseString("a");
		System.out.println("Single char string 'a' should have produced 'a'. Actually produced: *" + singleChar + "*");

	}

	public static String reverseString(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
	}

}
