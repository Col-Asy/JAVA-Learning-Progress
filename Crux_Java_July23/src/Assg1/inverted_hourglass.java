package Assg1;

import java.util.*;

public class inverted_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int row=1;
        int star=1;
        int space=2*n-1;
        while(row<=2*n+1){
            int i=1;
            int val=n;
            while(i<=star){
                System.out.print(val+" ");
                val--;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int r=1;
            int k=1;
            if(row==n+1){
                k=2;
            }
            if(row==n+1){
                r=2;
            }
            
            while(k<=star){
                System.out.print(val+r+" ");
                k++;
                val++;
            }
            if(row<=n){
            star++;
            space-=2;
            }
            else{
                star--;
                space+=2;
            }
            row++;
            System.out.println();
        }
		
	}

}
