package Assg3;
import java.util.*;

public class calculate_the_sum {
	public static long[] program(long[] arr, int gap) {
		long[] arr_new = new long[arr.length];
		for(int i=arr.length-1; i>-1; i--) {
			int add_index = i-gap;
			if (add_index<0) {
				add_index=arr.length+add_index;
			}
			arr_new[i] = arr[i]+arr[add_index];
		}
		
		return arr_new;
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
		
		int op = input.nextInt();
		for(int i=0; i<op; i++) {
			int gap  = input.nextInt();
			arr = program(arr, gap);
		}
		
		long sum = 0;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
		}
		
		System.out.println((int)(sum%(Math.pow(10, 9)+7)));
	}

}
