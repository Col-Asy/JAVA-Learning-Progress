package Assg3;

import java.util.Scanner;

public class selection_sort {
	public static void print_array(long[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void selection_srt(long[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					long temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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
		
		selection_srt(arr);
	}

}
