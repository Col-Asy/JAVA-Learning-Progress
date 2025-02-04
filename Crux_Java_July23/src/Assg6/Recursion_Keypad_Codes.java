package Assg6;

import java.util.Scanner;

public class Recursion_Keypad_Codes {
	static String[] refString = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "12";
		Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        
        patternPrint(str.toCharArray(), 0, "");
        System.out.println();
        System.out.println(countPatterns(str.toCharArray(), 0));
//        System.out.println(count);
	}
	
	private static int countPatterns(char[] nums, int idx) {
		// TODO Auto-generated method stub
		if(idx==nums.length) {
			return 1;
		}
		
		int count2 = 0;
		String letters = refString[nums[idx] - '0'];
		for(char letter: letters.toCharArray()) {
			count2+= countPatterns(nums, idx+1);
		}
		return count2;
	}
	
	
//	Method 1 does both the task
	private static void patternPrint(char[] nums, int idx, String ans) {
		// TODO Auto-generated method stub
		if(idx == nums.length) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		String letters = refString[nums[idx] - '0'];
		for(char letter: letters.toCharArray()) {
			patternPrint(nums, idx+1, ans+letter);
		}
	}
}
