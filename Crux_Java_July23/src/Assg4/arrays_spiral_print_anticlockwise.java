package Assg4;

import java.util.Scanner;

public class arrays_spiral_print_anticlockwise {
	public static void Display(int[][] arr) {
		int n=arr.length, m=arr[0].length;
		int j=0,k=0;
		while(j<n && k<m) {
			for(int i=j; i<n; i++) {
				System.out.print(arr[i][k] + ", ");
			}
			k++;
			
			for(int i=k; i<m; i++) {
				System.out.print(arr[n-1][i] + ", ");
			}
			n--;
			
			for (int i = n - 1; i >= j; --i) {
               System.out.print(arr[i][m - 1] + ", ");
            }
            m--;
            
            for (int i = m - 1; i >= k; --i) {
                System.out.print(arr[j][i] + ", ");
            }
            j++;
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
