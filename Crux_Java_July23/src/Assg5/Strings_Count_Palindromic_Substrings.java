package Assg5;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abc";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(countPalindrome(str));
	}

	public static int countPalindrome(String str) {
		int count = 0;
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);

				if (isPalindrome(s) == true)
					count++;
			}
		}

		return count;
	}

	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}

		return true;
	}

}
