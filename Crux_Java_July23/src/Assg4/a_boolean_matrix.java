package Assg4;

import java.util.Scanner;

public class a_boolean_matrix {
	public static void booleanDisplay(int[][] arr) {
		int[] n = new int[arr.length];
        int[] m = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    n[i] = 1;
                    m[j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (n[i] == 1 || m[j] == 1) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
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
		booleanDisplay(arr);
	}

}
