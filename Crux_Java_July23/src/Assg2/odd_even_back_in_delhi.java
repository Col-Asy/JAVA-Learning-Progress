package Assg2;
import java.util.Scanner;
public class odd_even_back_in_delhi {
	public static void check(long n) {
		long sum_even=0, sum_odd=0;
		
		while(n>0) {
			long rem=n%10;
			if(rem%2==0) {
				sum_even=sum_even+n%10;
			}
			else {
				sum_odd=sum_odd+n%10;
			}
			
			
			n=n/10;
		}
		
		if((sum_even%2==0 && sum_even%4==0)) {
			System.out.println("Yes");
		}
		else {
			if(sum_odd%3==0) {
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0; i<n; i++) {
			long m=input.nextLong();
			check(m);
		}
	}

}
