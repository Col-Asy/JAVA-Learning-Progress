package Assg3;

import java.util.Scanner;

public class sorting_linear_time_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int n_0=0, n_1=0, n_2=0;
		for(int i=0; i<n; i++) {
			int j = input.nextInt();
			arr[i] = j;
			
			if(j==0) n_0++;
			else if(j==1) n_1++;
			else n_2++;
		}
		
		for(int i=0; i<n_0; i++) {
			System.out.println(0);
		}
		for(int i=0; i<n_1; i++) {
			System.out.println(1);
		}
		for(int i=0; i<n_2; i++) {
			System.out.println(2);
		}
	}

}
