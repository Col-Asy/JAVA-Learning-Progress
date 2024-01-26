package Assg1;
import java.util.Scanner;

public class pattern_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        
        for(int i=0;i<n;i++){

            
            for(int j=0;j<n-i-1;j++)
                System.out.print("  ");


            for(int j=i+1;j<=2*i+1;j++)
                System.out.print(j + " ");

            
            for(int j=2*i;j>=i+1;j--)
                System.out.print(j + " ");

            System.out.println();
        }

        
        for(int i=n-2;i>=0;i--){

            
            for(int j=0;j<n-i-1;j++)
                System.out.print("  ");

            
            for(int j=i+1;j<=2*i+1;j++)
                System.out.print(j + " ");

            
            for(int j=2*i;j>=i+1;j--)
                System.out.print(j + " ");

            System.out.println();
        }
	}

}
