package Assg4;

import java.util.Scanner;

public class column_with_maximum_sum_in_a_matrix {
	public static void Display(int[][] arr) {
		int sum=0, max=0, col=0;
		for(int j=0; j<arr[0].length; j++) {
			for(int i=0; i<arr.length; i++) {
				sum+=arr[i][j];
			}
			
			if(Math.max(max, sum) > max) {
				max = Math.max(max, sum);
				col=j;
				sum=0;
			}
			sum=0;
		}
		
		System.out.println(col+1 + " " + max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();// row
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
//		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		Display(arr);
	}

}
