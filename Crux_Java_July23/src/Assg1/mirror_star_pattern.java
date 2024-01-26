package Assg1;

import java.util.*;

public class mirror_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int space=n/2;
		int split=n/2;
		int star=1;
		for(int i=0; i<=split; i++) {
		
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int k=0; k<star; k++) {
				System.out.print("* ");
			}
			star+=2;
			space--;
			System.out.println();
			
		}
		space+=2;
		star-=4;

		for(int l=0; l<split; l++) {
			for(int d=0; d<space; d++) {
				System.out.print("  ");
			}
			for(int m=0; m<star; m++) {
				System.out.print("* ");
			}
			star-=2;
			space++;
			System.out.println();
		}
		
	}

}
