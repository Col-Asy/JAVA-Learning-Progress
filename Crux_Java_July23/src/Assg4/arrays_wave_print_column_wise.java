package Assg4;

import java.util.Scanner;

public class arrays_wave_print_column_wise {
//	public static void Display(int[][] arr) {
//		int i=0, j=0,col=arr[0].length, row=arr.length;
//		
//		while(j<col) {
//			while(i<row) {
//				System.out.print(arr[i][j]+ ", ");
//				i++;
//			}
//			j++;
//			i--;
//			while(i>=0) {
//				System.out.print(arr[i][j]+ ", ");
//				i--;
//			}
//			j++;
//			i++;
//		}
//		System.out.println("END");
//	}
	
//	public static void Display(int[][] arr) {
//		int j=0;
//		while(j<arr[0].length) {
//			for(int i=0; i<arr.length; i++) {
//				System.out.print(arr[i][j] + ", ");
//			}
//			j++;
//			for(int i=arr.length-1; i>-1; i--) {
//				System.out.print(arr[i][j] + ", ");
//			}
//			j++;
//		}
//		System.out.println("END");
//	}
	
	public static void Display(int[][] arr) {
		 for (int j = 0; j < arr[0].length; j++) {

           if (j % 2 == 0) {
               for (int i = 0; i < arr.length; i++) {
                   System.out.print(arr[i][j] + ", ");
               }
           } else {
               for (int i = arr.length - 1; i >= 0; i--) {
                   System.out.print(arr[i][j] + ", ");
               }
           }
       }

       System.out.println("END");

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
