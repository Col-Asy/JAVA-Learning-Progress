package Assg4;
import java.util.*;
public class painter_partition_problem_JAVA {
	public static boolean isPossible(int[] arr, int n, int k, int mid) {
        int painters = 1;
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += arr[i];
            if (time > mid) {
                time = arr[i];
                painters++;
                if (painters > k) {
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int total = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
            max = Math.max(max, arr[i]);
        }
        int start = max;
        int end = total;
        int result = start;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(result);
	}

}
