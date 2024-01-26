package Assg2;

import java.util.*;

public class inverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		int temp = n;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count = count + 1;
		}
		int i = 1;
		while (i <= count) {
			int d = n % 10;
			int y = i * (int) Math.pow(10, d - 1);
			sum = sum + y;
			n = n / 10;
			i++;

		}
		System.out.println(sum);

	}

}
