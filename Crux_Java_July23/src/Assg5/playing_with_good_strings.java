package Assg5;

import java.util.Scanner;

public class playing_with_good_strings {
	public static int longestGoodStr(String str) {
		int maxLength = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
                maxLength = Math.max(maxLength, count);
            } else {
                count = 0;
            }
        }
        return maxLength;
	}
	
//	public static int longestGoodString(String s) {
//		int pointer=0, ans=0;
//			
//		for(int i=0; i<s.length(); i++) {
//			char ch=s.charAt(i);
//			if(isVowel(ch)) {
//				pointer++;
//			}
//			
//			else {
//				ans=Math.max(ans, pointer);
//				pointer=0;
//			}
//		}
//		return ans;
//	}
//	
//	public static boolean isVowel(char ch) {
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		String s = input.next();
		
		String s="asdfaeicsd";
		
		System.out.println(longestGoodStr(s));
	}

}
