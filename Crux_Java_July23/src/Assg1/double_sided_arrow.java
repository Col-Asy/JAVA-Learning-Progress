package Assg1;
import java.util.*;          

public class double_sided_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner (System.in);
		
		int n=input.nextInt();
		
		int row=1;
	
		int rowval=1;
		int space=n-1; //outer space
		int star=1;
		int space_1=-1;
		
		while(row<=n) {
			
			//outer space
			
			int i=1;
			
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//Left star 
			
			int j=1;
			int val=rowval;
			
			while(j<=star) {
				System.out.print(val+" ");
				val--;
				j++;
			}
			
			// inner space 2
			
			
			int k=1;
			
		
		
			while(k<=space_1) {
				
			System.out.print("  ");	
			k++;
			}
			
			
			
			
          //Right star 2
			
			
			
			int l=1;
			val++;
			
			if(row==1 || row==n) {
				l=2;
				
			}
			
			while(l<=star) {
				System.out.print(val +" ");
				val++;
				l++;
			}
			
			
			
		
			
			// horizontal mirror
			if(row<n/2+1) {
				
				space_1+=2;
				space-=2;
				star++;
				rowval++;
			}
			else {
				
				space+=2;
				space_1-=2;
				star--;
				rowval--;
			}
			
			
			//next row
			
			row++;
			System.out.println();
			
			
		}
		
		

	}

}