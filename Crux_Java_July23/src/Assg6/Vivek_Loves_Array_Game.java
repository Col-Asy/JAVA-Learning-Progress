package Assg6;

import java.util.Scanner;

public class Vivek_Loves_Array_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			System.out.println(gameScore(A, 0, N - 1));
		}

	}

	private static int gameScore(int[] A, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end) {
			return 0;
		}
		
		int leftSum=0;
		for(int i=start; i<=end; i++) {
			leftSum+=A[i];
			int rightSum=0;
			for(int j=i+1; j<=end; j++) {
				rightSum+=A[j];
			}
			
			if(leftSum==rightSum) {
				return 1 + Math.max(gameScore(A, start, i), gameScore(A, i+1, end));
			}
		}
		
		return 0;

	}

}
