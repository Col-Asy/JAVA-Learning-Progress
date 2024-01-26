package Assg4;
import java.util.*;
public class murthal_parantha {

	public static boolean isPossible(int[] rank, int P, int mid) {
        int time = 0;
        int paranthas = 0;
        for (int i = 0; i < rank.length; i++) {
            time = rank[i];
            int j = 2;
            while (time <= mid) {
                paranthas++;
                time = time + (rank[i] * j);
                j++;
            }
            if (paranthas >= P) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int L = scanner.nextInt();
        int[] rank = new int[L];
        for (int i = 0; i < L; i++) {
            rank[i] = scanner.nextInt();
        }
        Arrays.sort(rank);
        int low = 0;
        int high = rank[L - 1] * P * (P + 1) / 2;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(rank, P, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

}
