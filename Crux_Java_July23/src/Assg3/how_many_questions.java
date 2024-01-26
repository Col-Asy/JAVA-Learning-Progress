package Assg3;
import java.util.*;
public class how_many_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(), sum=0;
		for(int i=0; i<n; i++) {
			int agree=0;
			for(int j=0; j<3; j++) {
				int inpt=input.nextInt();
				if(inpt==1) {
					agree+=1;
				}
			}
			
			if(agree>1) {
				sum+=1;
			}
		}
		
		System.out.println(sum);
	}

}
