package Assg4;
import java.util.*;
public class book_allocation {
	public static boolean isPossible(int[] pages, int m, int mid) {
        int studentsRequired = 1;
        int curr_sum = 0;
        for (int i = 0; i < pages.length; i++) {
            if (pages[i] > mid) {
                return false;
            }
            if (curr_sum + pages[i] > mid) {
                studentsRequired++;
                curr_sum = pages[i];
                if (studentsRequired > m) {
                    return false;
                }
            } else {
                curr_sum += pages[i];
            }
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] pages = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                pages[i] = scanner.nextInt();
                sum += pages[i];
            }
            int start = 0, end = sum;
            int ans = Integer.MAX_VALUE;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (isPossible(pages, m, mid)) {
                    ans = Math.min(ans, mid);
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }

}
