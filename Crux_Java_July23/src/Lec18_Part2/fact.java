package Lec18_Part2;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(n));
	}

	public static int fac(int n) {
		// base case
		if (n == 0) {
			return 1;
		}

		int fn = fac(n - 1);// sp
		return fn * n;

	}

}
