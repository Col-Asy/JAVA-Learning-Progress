package Assg6;

import java.util.Scanner;

public class Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "1??0?101";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String str = sc.next();
			patternString(str.toCharArray(), 0);
		}
		sc.close();
	}

	private static void patternString(char[] nums, int idx) {
		// TODO Auto-generated method stub
		if (idx == nums.length) {
			System.out.println(new String(nums));
			return;
		}

		if (nums[idx] == '?') {
			nums[idx] = '0';
			patternString(nums, idx + 1);
			nums[idx] = '1';
			patternString(nums, idx + 1);
			nums[idx] = '?';
		} else {
			patternString(nums, idx + 1);
		}
	}
}
