package Assg5;

import java.util.*;

public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "aaabbccds";
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		basicCompression(str);
	}

	public static void basicCompression(String str) {
		int startPt = 0, endPt = 0, count = 0;
		String strNew = "";
		while (endPt < str.length()) {

			if (str.charAt(startPt) == str.charAt(endPt)) {
				count++;
			}

			else {
				strNew += str.charAt(startPt);
				if (count > 1)
					strNew += count;
				startPt = endPt;
				endPt--;
				count = 0;
			}

			endPt++;
		}
		endPt--;
		System.out.print(strNew + str.charAt(endPt));
		if (count > 1)
			System.out.print(count);

	}

}
