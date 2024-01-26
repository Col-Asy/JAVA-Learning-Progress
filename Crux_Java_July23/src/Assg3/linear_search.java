package Assg3;

import java.util.Scanner;

public class linear_search {

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
		int s=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==num) {
				System.out.println(i);
			}
			
			else {
				s+=1;
			}
		}
		
		if(s==arr.length) {
			System.out.println(-1);
		}
	}

}
