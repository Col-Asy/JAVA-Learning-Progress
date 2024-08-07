package Assg5;

import java.util.*;

public class Subarrays_Having_product_less_than_k {
	public static int returnArraysNumber(long[] arr, long k) {
		int endPt=0, startPt = 0, count = 0;
		
		
		while(startPt<arr.length) {
			long prdct = 1;
			for(endPt=startPt; endPt<arr.length; endPt++) {
				prdct*=arr[endPt];
				if(prdct<k) {
					count++;
				}
				else break;
			}
			startPt++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		long k=input.nextLong();
		
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = input.nextLong();
		}
		

		System.out.println(returnArraysNumber(arr, k));
	}

}
