package Assg1;
import java.util.*;
public class pattern_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int a = 0;
		int b = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(a + "   ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }	
	}

}
