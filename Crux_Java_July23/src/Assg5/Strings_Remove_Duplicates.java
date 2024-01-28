package Assg5;
import java.util.*;
public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(longestSubstring(s, k));
        }
        sc.close();
    }

    public static int longestSubstring(String s, int k) {
        int[] count = new int[26];
        int u = 0;
        for (char c : s.toCharArray()) {
            if (count[c - 'a']++ == 0) {
                u++;
            }
        }

        if (u < k) {
            return -1;
        }

        Arrays.fill(count, 0);
        int left = 0, right = 0, maxLen = 0, unique = 0;
        while (right < s.length()) {
            if (count[s.charAt(right) - 'a']++ == 0) {
                unique++;
            }
            right++;

            while (unique > k) {
                if (--count[s.charAt(left) - 'a'] == 0) {
                    unique--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }

}
