package Assg3;

import java.util.Scanner;

public class insertion_sort {
	public static void print_array(long[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void insertion_srt(long[] arr) {
		for (int i = 1; i < arr.length; i++) {
			long item = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;

		}
		print_array(arr);
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
		
		insertion_srt(arr);
	}

}
