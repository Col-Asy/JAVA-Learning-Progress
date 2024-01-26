package Assg2;
import java.util.*;
public class shopping_game {
	public static void case_study(int n_aayush, int n_harshit) {
		int aayush=0, harshit=0;
		int i=1;
		while(i>0) {
			if(i%2==0) {
				harshit+=i;
				if(harshit>n_harshit) {
					System.out.println("Aayush");
					break;
				}
			}
			else {
				aayush+=i;
				if(aayush>n_aayush) {
					System.out.println("Harshit");
					break;
				}
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0; i<n; i++) {
			
			int n_aayush=input.nextInt();
			int n_harshit=input.nextInt();
			case_study(n_aayush, n_harshit);
		}
		
	}

}
