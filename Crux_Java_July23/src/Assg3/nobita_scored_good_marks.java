package Assg3;
import java.util.*;
public class nobita_scored_good_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t>0) {
			long x=input.nextLong(), n=input.nextLong();
			if(x%n!=0) {
				int left=(int) (x%n);
				if(left<=n/2) {
					System.out.println(left);
				}
				else {
					System.out.println(n-left);
				}
			}
			else if(x<n) {
				System.out.println(x);
			}
			else {
				System.out.println(0);
			}
			t--;
		}
		
	}

}
