package Assg6;

import java.util.Scanner;

public class Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(lastIndex(arr, sc.nextInt(), n-1));
	}
	
	private static int lastIndex(int[] arr, int m, int lastIndex) {
		// TODO Auto-generated method stub
		if(lastIndex<0) return -1;
		
		if(arr[lastIndex]==m) return lastIndex;
		
		return lastIndex(arr, m, lastIndex-1);
	}

}
