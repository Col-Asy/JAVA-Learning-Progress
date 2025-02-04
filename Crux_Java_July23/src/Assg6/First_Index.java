package Assg6;

import java.util.Scanner;

public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(firstIndex(arr, sc.nextInt(), 0, n));
	}
	
	private static int firstIndex(int[] arr, int m, int sp, int ei) {
		// TODO Auto-generated method stub
		if(sp>=ei) return -1;
		
		if(arr[sp]==m) return sp;
		
		return firstIndex(arr, m, sp+1, ei);
	}

}
