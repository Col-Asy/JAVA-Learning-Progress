package Assg6;

import java.util.Scanner;

public class All_Indices_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3, 2, 1, 2, 3};
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
		printIndex(arr, scanner.nextInt(), 0);
		scanner.close();
	}
	
	private static void printIndex(int[] arr, int n, int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length) return;
		if(arr[idx] == n) System.out.print(idx + " ");
		
		printIndex(arr, n, idx+1);
	}

}
