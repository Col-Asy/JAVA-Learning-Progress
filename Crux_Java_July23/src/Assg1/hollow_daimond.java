package Assg1;

import java.util.*;

public class hollow_daimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner input=new Scanner(System.in);
			int n=(input.nextInt())/2+1;
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n - i + 1; j++) {
					System.out.print("*\t");
				}

				for (int k = 1; k < 2 * i - 2; k++) {
					System.out.print("\t");
				}
				for (int j = 1; j <= n - i + 1; j++) {
					if(i==1 && j==1) {
						continue;
					}
	                System.out.print("*\t");
				}
				System.out.println();
			}

			for (int i = n-1; i >= 1; i--) {
				for (int j = i; j <= n; j++) {
					System.out.print("*\t");
				}
				// loop calculates space
				for (int k = 1; k < (2 * i) - 2; k++) {
					System.out.print("\t");
				}
				for (int j = i; j <= n; j++) {
					if(i==1 && j==1) {
						continue;
					}
					System.out.print("*\t");
				}
				System.out.println();
			}
		
	}

}
