package Assg2;

import java.util.*;

public class nth_fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n, t1 = 0, t2 = 1, nextTerm = 0, i;
		n = input.nextInt();
		if (n == 0 || n == 1)
			System.out.println(n);
		else
			nextTerm = t1 + t2;
		for (i = 3; i <= n + 1; ++i) {
			t1 = t2;
			t2 = nextTerm;
			nextTerm = t1 + t2;
		}
		System.out.println(t2);

	}

}
