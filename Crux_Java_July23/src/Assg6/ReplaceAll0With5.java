package Assg6;

import java.util.Scanner;

public class ReplaceAll0With5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "103";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(replace(0, "", str));
	}

	static String replace(int n, String ans, String str) {
		if (n >= str.length()) {
			return ans;
		}

		if (str.charAt(n) == '0') {
			ans += '5';

		} else {
			ans += str.charAt(n);
		}
		return replace(n + 1, ans, str);
	}

}
