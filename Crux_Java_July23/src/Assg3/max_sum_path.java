package Assg3;
import java.util.*;
public class max_sum_path {
	public static long maxSumPath(long[] ar1, long[] ar2) {
        int m = ar1.length;
        int n = ar2.length;
        int i = 0, j = 0;
        long result = 0, sum1 = 0, sum2 = 0;

        while (i < m && j < n) {
            if (ar1[i] < ar2[j]) {
                sum1 += ar1[i++];
            } else if (ar1[i] > ar2[j]) {
                sum2 += ar2[j++];
            } else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < m && j < n && ar1[i] == ar2[j]) {
                    result += ar1[i++];
                    j++;
                }
            }
        }

        while (i < m) {
            sum1 += ar1[i++];
        }

        while (j < n) {
            sum2 += ar2[j++];
        }

        result += Math.max(sum1, sum2);
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t-- > 0){
            int n = input.nextInt();
            int m = input.nextInt();
            
            long[] arr1 = new long[n];
            for(int i=0; i<n; i++){
                arr1[i] = input.nextLong();
            }
            
            long[] arr2 = new long[m];
            for(int i=0; i<m; i++){
                arr2[i] = input.nextLong();
            }
            
            System.out.println(maxSumPath(arr1, arr2));
        }
     
	}

}
