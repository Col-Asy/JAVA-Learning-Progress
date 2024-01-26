package Assg3;
import java.util.*;
public class product_of_array_except_self {
	public static long[] prdct(long[] arr) {
		int n = arr.length;
		// initialize output_arr array
		long[] output_arr = new long[n];
		output_arr[n-1] = 1;

		for (int i = n-2; i >= 0; i--) {			
				output_arr[i] = output_arr[i+1] * arr[i+1];
		  }

		  long left = 1;
		  for (int i = 0; i < n; i++) {			
			  	output_arr[i] = output_arr[i] * left;
			  	left = left * arr[i];
		  }
		  return output_arr;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			long temp=input.nextLong();
			arr[i]=temp;
		}
		
		long[] arr_new=prdct(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr_new[i] + " ");
		}
	}

}
