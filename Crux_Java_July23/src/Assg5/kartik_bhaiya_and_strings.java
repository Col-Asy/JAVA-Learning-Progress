package Assg5;
import java.util.*;
public class kartik_bhaiya_and_strings {
	public static int maxFlipCount(int k, String str, char ch) {
		int endPt = 0, startPt = 0, flip = 0, ans = 0;

		while (endPt < str.length()) {
			if (str.charAt(endPt) == ch) {
				flip++;
			}

			while (flip > k) {
				if (str.charAt(startPt) == ch) {
					flip--;
				}
				startPt++;
			}

			ans = Math.max(ans, endPt - startPt + 1);
			endPt++;
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String str = input.next();

		System.out.println(Math.max(maxFlipCount(k, str, 'a'), maxFlipCount(k, str, 'b')));
	}

}
