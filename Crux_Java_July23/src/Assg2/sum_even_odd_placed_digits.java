package Assg2;
import java.util.*;
public class sum_even_odd_placed_digits {
	public static void getSum(int n) {
		
		int sumOdd = 0, sumEven = 0, pointer = 1;

		while (n != 0) {
			if (pointer % 2 == 0)
				sumEven += n % 10;
			else
				sumOdd += n % 10;
			n /= 10;
			pointer++;
		}

		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		getSum(n);
	
	}

}
