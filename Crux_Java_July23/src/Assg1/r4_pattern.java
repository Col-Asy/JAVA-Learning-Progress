package Assg1;
import java.util.*;

public class r4_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=0;
		
		while(i<n) {
			int j=0;
			while(j<=i) {
				System.out.print("*\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
