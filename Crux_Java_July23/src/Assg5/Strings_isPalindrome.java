package Assg5;
import java.util.*;
public class Strings_isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "acda";
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
		}
		return true;
	}

}
