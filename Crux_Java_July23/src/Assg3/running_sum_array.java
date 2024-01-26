package Assg3;

import java.util.Scanner;

public class running_sum_array {
	public static void runningSum(long[] arr) {
		long sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			System.out.print(sum + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			long j = input.nextLong();
			arr[i] = j;
		}
		
		runningSum(arr);
	}

}
