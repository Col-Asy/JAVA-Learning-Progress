package Assg2;
import java.util.*;
public class digits_reverse {
	public static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			rev = (rev * 10) + (n % 10);
			n /= 10;
		}
		return rev;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		System.out.println(reverse(n));
	}

}
