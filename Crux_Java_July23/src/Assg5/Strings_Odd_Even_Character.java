package Assg5;

import java.util.*;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="abcg";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		toggleChar(str);
	}

	public static void toggleChar(String str) {
		String strNew = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				char ch = str.charAt(i);
				strNew += (char) ((int) ch + 1);

			} else {
				char ch = str.charAt(i);
				strNew += (char) ((int) ch - 1);

			}
		}
		System.out.println(strNew);
	}

}
