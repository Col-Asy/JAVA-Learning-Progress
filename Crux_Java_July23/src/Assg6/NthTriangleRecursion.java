package Assg6;

import java.util.Scanner;

public class NthTriangleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Ans(n));
	}

	static int Ans(int n) {
		if (n < 1) {
			return 0;
		}

		int i = n + Ans(n - 1);
		return i;
	}

}
