package Lec18_Part2;

public class print_Dec {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PD(n);

	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}


}
