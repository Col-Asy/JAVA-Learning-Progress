package Assg2;

import java.util.Scanner;

public class prime_check {
	public static void prime(int n) {
		int i=2;
		int sum=0;
		while(i<n) {
			if(n%i!=0) {
				sum+=1;
			}
			else {
				break;
			}
			i++;
		}
		if(sum==n-2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		prime(n);
	}

}
