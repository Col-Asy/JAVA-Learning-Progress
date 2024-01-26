package Assg1;

import java.util.*;
public class number_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=1;
		for (int j=1; j<=n; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print(i+"\t");
				i++;
			}
			System.out.println();
			
		}
		
	}

}
