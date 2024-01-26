package Assg4;

import java.util.Scanner;

public class rotate_image {
	public static void Display(int[][] arr) {
		int[][] arr_new = new int[arr[0].length][arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr_new[arr_new.length-j-1][i] = arr[i][j];
//				System.out.println(j);
//				System.out.println(arr_new[0].length-i-1);
//				System.out.println(arr[i][j]);
//				System.out.println(arr_new[i][j]);
			}
		}
		
		for(int i=0; i<arr_new.length; i++) {
			for(int j=0; j<arr_new[0].length; j++) {
				System.out.print(arr_new[i][j] + " ");
			}
            System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();// row
		int m = input.nextInt();// col
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
//		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		Display(arr);
	}

}
