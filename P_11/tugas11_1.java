import java.util.Scanner;

public class tugas11_1 {
	static boolean testPalindrome(String kata) {
		int left = 0;
		int right = kata.length() - 1;
		for (int i = left; i < right; i++, right--) {
			if (Character.toLowerCase(kata.charAt(i)) != Character.toLowerCase(kata.charAt(right))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("==== CEK PALINDROME ====");
		System.out.print("Input kata : ");
		String kata = input.nextLine();
		input.close();
		if (testPalindrome(kata))
			System.out.println(kata + " adalah Palindrome");
		else
			System.out.println(kata + " BUKAN Palindrome");
	}
}
