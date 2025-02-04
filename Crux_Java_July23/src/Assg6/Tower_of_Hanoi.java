package Assg6;

import java.util.Scanner;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		moves(sc.nextInt(), 'A', 'B', 'C');
		sc.close();
	}
	
	private static void moves(int n, char fromPeg, char toPeg, char helperPeg) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println("Moving ring 1 from " + fromPeg + " to " + toPeg);
			return;
		}
		moves(n-1, fromPeg, helperPeg, toPeg);
		System.out.println("Moving ring " + n + " from " + fromPeg + " to " + toPeg);
		moves(n-1, helperPeg, toPeg, fromPeg);
	}

}
