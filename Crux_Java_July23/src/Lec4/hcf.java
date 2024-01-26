package Lec4;
import java.util.*;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Number 1: ");
		int n1=input.nextInt();
		System.out.print("Number 2: ");
		int n2=input.nextInt();
		
		int dividend, divisor;
		if(n1>n2) {
			dividend=n1;
			divisor=n2;
		}
		else {
			dividend=n2;
			divisor=n1;
		}
		int remainder=1;
		while (dividend%divisor!=0) {
			remainder=dividend%divisor;
			dividend=divisor;
			divisor=remainder;
		}
		
		
		System.out.println(divisor+" is the HCF");
	}

}
