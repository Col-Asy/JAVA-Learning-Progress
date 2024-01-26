package Assg4;

import java.util.Scanner;

public class arrays_wave_print_row_wise {
	public static void Display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+ ", ");
				}
			}
			else {
				for(int j=arr[i].length-1; j>-1; j--) {
					System.out.print(arr[i][j]+ ", ");
				}
			}
		}
		System.out.println("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// row
		int m = sc.nextInt();// col
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Display(arr);
	}

}
