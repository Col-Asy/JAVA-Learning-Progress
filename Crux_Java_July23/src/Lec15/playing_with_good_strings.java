package Lec15;
import java.util.*;
public class playing_with_good_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(longest_Good_Strings(s));

	}

	public static int longest_Good_Strings(String s) {
		int ans = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Isvowels(ch) == true) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;
			}

		}
		ans = Math.max(ans, count);
		return ans;
	}

	public static boolean Isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}


}
