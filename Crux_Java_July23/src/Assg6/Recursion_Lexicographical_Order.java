package Assg6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Recursion_Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nums = new ArrayList<String>();
		
		printNumLexo(sc.nextInt(), nums);
		Collections.sort(nums);
		for (String num : nums) {
            System.out.print(num + " ");
        }

	}
	
	static ArrayList<String> printNumLexo(int n, ArrayList<String> nums) {
		// TODO Auto-generated method stub
		if (n<0) {
			return nums;
		}
		
		printNumLexo(n-1, nums);
		nums.add(Integer.toString(n));
		return nums;
		
	}

}
