package Assg5;

import java.util.*;

public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "ABc";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		toggleCase(str);
	}

	public static void toggleCase(String str) {
		String strNew = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				strNew = strNew + Character.toLowerCase(str.charAt(i));
			} else {
				strNew = strNew + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(strNew);
	}

}
