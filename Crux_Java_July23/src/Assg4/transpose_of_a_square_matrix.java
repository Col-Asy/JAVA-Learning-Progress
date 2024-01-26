package Assg4;

import java.util.Scanner;

public class transpose_of_a_square_matrix {

	public static void Display(int[][] arr) {
		int[][] arr_new = new int[arr[0].length][arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr_new[j][i] = arr[i][j];
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
		Display(arr);
	}

}
