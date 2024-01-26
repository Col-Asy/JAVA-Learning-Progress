package Assg3;

import java.util.Scanner;

public class target_sum_triplets {
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
	
	public static void tripletSum(long[] arr, long n) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==n) {
						System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
					}
					else {
						continue;
					}
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
		tripletSum(insertion_srt(arr), num);
	}

}
