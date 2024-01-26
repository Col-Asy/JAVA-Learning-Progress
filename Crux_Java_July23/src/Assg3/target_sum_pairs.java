package Assg3;

import java.util.Scanner;

public class target_sum_pairs {
	public static long[] insertion_srt(long[] arr) {
		for (int i = 1; i < arr.length; i++) {
			long item = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;

		}
		return arr;
	}
	
	public static void pairSum(long[] arr, long n) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
					if(arr[i]+arr[j]==n) {
						System.out.println(arr[i]+" and "+arr[j]);
					}
					else {
						continue;
					}
			}
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
		long num = input.nextLong();
		pairSum(insertion_srt(arr), num);
	}
	
}
