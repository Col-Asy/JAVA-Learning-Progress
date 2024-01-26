package Assg2;
import java.util.*;
public class gcd_finding {
	public static int gcd(int n, int m) {
		int remainder=1, divisor, dividend;
		if(n>m) {
			dividend=n;
			divisor=m;
		}
		else {
			dividend=m;
			divisor=n;
		}
		
		while (dividend%divisor!=0) {
			remainder=dividend%divisor;
			dividend=divisor;
			divisor=remainder;	
		}
		return(divisor);			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		System.out.println(gcd(n,m));
	}

}
