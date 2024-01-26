package Lec13;
import java.util.*;
public class aggressive_cows {

	public static boolean check(int mid, int[] stalls, int cows) {
        int count = 1;
        int lastPlaced = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= mid) {
                if (++count == cows) {
                    return true;
                }
                lastPlaced = stalls[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int[] stalls = new int[N];
        for (int i = 0; i < N; i++) {
            stalls[i] = scanner.nextInt();
        }
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[N - 1] - stalls[0];
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (check(mid, stalls, C)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
    }

}
