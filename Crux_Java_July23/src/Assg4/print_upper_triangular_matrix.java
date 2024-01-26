package Assg4;
import java.util.*;
public class print_upper_triangular_matrix {
	public static void printUpperTriangular(int[][] arr) {
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				arr[i][j]=0;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();// row
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		printUpperTriangular(arr);
	}

}
