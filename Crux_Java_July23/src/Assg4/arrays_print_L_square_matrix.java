package Assg4;

import java.util.Scanner;

public class arrays_print_L_square_matrix {

	public static void Display(int[][] arr) {
		int n=arr.length, m=arr[0].length;
		int j=0,k=0;
		while(j<n && k<m) {
			for(int i=j; i<n; i++) {
				System.out.print(arr[i][k] + ", ");
			}
			k++;
			
			for(int i=k; i<m; i++) {
				System.out.println(arr[n-1][i] + ", ");
			}
			n--;
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
