package Assg5;

import java.util.*;

public class Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="acb";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		strDiff(str);
	}

	public static void strDiff(String str) {
		String strNew = "";
		for (int i = 1; i < str.length(); i++) {
			strNew += str.charAt(i - 1);
			strNew += ((int) str.charAt(i) - (int) str.charAt(i - 1));
		}

		System.out.print(strNew);
		System.out.print(str.charAt(str.length() - 1));
	}

}
