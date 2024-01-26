package Lec4;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int rev_n=0;
		while(n>0) {
			int remainder=n%10;
			rev_n=rev_n*10 + remainder;
			n=n/10;
		}
		System.out.println(rev_n);
	}

}
