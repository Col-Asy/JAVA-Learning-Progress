package Assg2;

import java.util.Scanner;

public class armstrong_for_range {
	public static int length(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int[] separate_number(int n, int len) {
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i]=n%10;
			n/=10;
		}
		return arr;
	}
	
	public static boolean check_armstrong(int[] arr, int len, int n) {
		int sum=0;
		for(int i=0; i<len; i++) {
			sum+=(Math.pow(arr[i], len));
		}
		
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void print_armstrong(int min, int max) {
		for(int i=min; i<=max; i++) {
			int len=length(i);
			boolean condt=check_armstrong(separate_number(i, len), len, i);
			if(condt==true) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int min=input.nextInt(), max=input.nextInt();
		print_armstrong(min, max);
	}

}
