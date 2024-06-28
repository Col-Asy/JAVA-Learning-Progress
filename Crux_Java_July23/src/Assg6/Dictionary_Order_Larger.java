package Assg6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dictionary_Order_Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input = "cab";
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean[] used = new boolean[input.length()];
		List<String> validCombinations = new ArrayList<>();
		printGreaterCombinations(input.toCharArray(), used, "", validCombinations);
		
		String[] sortedCombinations = validCombinations.toArray(new String[0]);
		Arrays.sort(sortedCombinations);
		
		for (String combinations : sortedCombinations) {
			System.out.println(combinations);
		}
	}
	
	static void printGreaterCombinations(char[] str, boolean[] used, String newStr, List<String> validCombinations) {
		if (newStr.length() == str.length) {
			if (newStr.compareTo(String.valueOf(str)) > 0) {
				validCombinations.add(newStr);
			}
			
			return;
		}
		
		for (int i = 0; i < str.length; i++) {
			if (!used[i]) {
				used[i] = true;
				printGreaterCombinations(str, used, newStr+str[i], validCombinations);
				used[i] = false;
			}
		}
		
	}

}
