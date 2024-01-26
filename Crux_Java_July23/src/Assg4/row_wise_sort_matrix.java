package Assg4;

import java.util.Arrays;
import java.util.Scanner;

public class row_wise_sort_matrix {
	public static int[][] rowSort(int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}
		return arr;
	}
	
	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
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
		
		Display(rowSort(arr));
	}

}
