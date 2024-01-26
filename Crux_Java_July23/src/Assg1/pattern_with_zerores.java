package Assg1;
import java.util.*;

public class pattern_with_zerores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i==0) {
				System.out.println(i+1+" ");
			}
			else {
				System.out.print(i+1+" ");
				if(i>1) {
					for(int j=0; j<i-1; j++) {
						System.out.print("0 ");
					}
				}
				System.out.println(i+1+" ");
			}
			
		}
	}

}
