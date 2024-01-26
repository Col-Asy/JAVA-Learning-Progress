package Assg3;

import java.util.Scanner;

public class max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long max = Long.MIN_VALUE;
		
//		With Array in code
//		long[] arr = new long[n];
//		for(int i=0; i<n; i++) {
//			long j = input.nextLong();
//			arr[i] = j;
//		}
		
//		Without array in code
		for(int i=0; i<n; i++) {
			long j = input.nextLong();
			if(j>max) {
				max=j;
			}
		}
	}

}
