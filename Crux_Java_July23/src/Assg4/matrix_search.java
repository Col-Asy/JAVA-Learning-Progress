package Assg4;

import java.util.Arrays;
import java.util.Scanner;

public class matrix_search {
	public static void Search(int[][] arr, int item) {
		int r = 0;
		int c = arr[0].length - 1;
		while (r < arr.length && c >= 0) {
			if (arr[r][c] == item) {
				System.out.println(1);;
			} else if (arr[r][c] > item) {
				c--;
			} else {
				r++;
			}
		}
		System.out.println(0);

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
		
		for(int i=0; i<arr.length; i++) {
	    	   Arrays.sort(arr[i]);
	       }
		
		int item=input.nextInt();
		
		Search(arr, item);
	}

}
