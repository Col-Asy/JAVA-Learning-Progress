package Assg2;
import java.util.*;
public class conversion_farenheit_to_celsius {
	public static int conversion(int n) {
		int c=(5*(n-32))/9;
		return c;
	}
	
	public static void f_to_c(int min, int max, int step) {
		int i=min;
		while(i<=max) {
			System.out.print(i+"\t");
			System.out.println(conversion(i));
			i+=step;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int min=input.nextInt(), max=input.nextInt(), step=input.nextInt();
		f_to_c(min, max, step);
	}

}
