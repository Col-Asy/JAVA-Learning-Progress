package Lec4;
import java.util.*;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int i=2;
		int condt=0;
		while(i<n) {
			if(n%i==0) {
				condt++;
				break;
			}
			i++;
		}
		if(condt>0) {
			System.out.println(n+" is not a prime number");
		}
		else {
			System.out.println(n+" is a prime number");
		}
	}

}
