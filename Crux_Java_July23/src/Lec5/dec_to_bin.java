package Lec5;
public class dec_to_bin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23, sum=0, mul=1;
		while(n>0) {
			int rem=n%2;
			sum=sum+rem*mul;
			n=n/2;
			mul*=10;
		}
		System.out.println(sum);
	}

}
