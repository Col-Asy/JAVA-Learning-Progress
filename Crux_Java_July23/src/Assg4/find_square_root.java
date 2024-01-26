package Assg4;

import java.util.Scanner;

public class find_square_root {
	public static void Display(long n) {
		long pointer=1, end=n;
		while(pointer<=end) {
			long mid=pointer + (end - pointer)/2;
			
			if(Math.pow(mid, 2)<=n) {
				if(Math.pow(mid+1, 2)>n) {
					System.out.println(mid);
									}
				pointer=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        
        Display(n);
	}

}
