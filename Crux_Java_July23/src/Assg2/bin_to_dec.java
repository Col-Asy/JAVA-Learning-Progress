package Assg2;
import java.util.*;

public class bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10;
			mul = mul * 2;
		}
		
		System.out.println(sum);
	}

}
