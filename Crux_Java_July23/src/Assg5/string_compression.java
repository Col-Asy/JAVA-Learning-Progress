package Assg5;

import java.util.*;

public class string_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.next();

		System.out.println(compressedString(str));
	}

	public static String compressedString(String str) {
		String strCompressed = "";
		int pointerStart = 0, pointerEnd = 0, repetition = 0;

		while (pointerEnd < str.length()) {
			if (str.charAt(pointerEnd) == str.charAt(pointerStart)) {
				repetition++;
			}

			else {
				strCompressed = strCompressed + str.charAt(pointerStart) + repetition;
				repetition = 0;
				pointerStart = pointerEnd;
				pointerEnd--;
			}
			pointerEnd++;
		}
		strCompressed = strCompressed + str.charAt(pointerStart) + repetition;

		return strCompressed;
	}

}
