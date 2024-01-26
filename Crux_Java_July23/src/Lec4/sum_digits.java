package Lec4;

public class sum_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int sum=0;
		while(n>0) {
			int remainder=n%10;
			sum+=remainder;
			System.out.println(sum);
			System.out.println(remainder);
			n=n/10;
			System.out.println(n);
		}
		System.out.println(sum+" is sum of the digits");
			
	}

}
