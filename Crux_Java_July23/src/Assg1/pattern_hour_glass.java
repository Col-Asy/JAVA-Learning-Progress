package Assg1;
import java.util.*;
public class pattern_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int no=n;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int k=no; k>0; k--) {
				System.out.print(k+" ");
			}
			for(int l=0; l<=no; l++) {
				System.out.print(l+" ");
			}
			no--;
			System.out.println();
		}
		no+=2;
		
		for(int i=0; i<n; i++) {
			for(int j=n-2; j>=i; j--) {
				System.out.print("  ");
			}
			for(int k=no; k>0; k--) {
				System.out.print(k+" ");
			}
			for(int l=0; l<=no; l++) {
				System.out.print(l+" ");
			}
			no++;
			System.out.println();
		}
		
	}

}
