package Assg3;
import java.util.*;
public class alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int q = input.nextInt();
        while (q-- > 0) {
            int amount = input.nextInt();
            int k = input.nextInt();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (amount % arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt >= k) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }
	}
}
