package Lec4;
import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();

		
		for (int i=1; i<=n; i++) {
			int a=0;
			int b=1;			
			for(int j=1; j<=i; j++) {
				int c=a+b;
				System.out.print(c);
				a=b;
				b=c;
			}
			System.out.println();
			
		}
	}

}
