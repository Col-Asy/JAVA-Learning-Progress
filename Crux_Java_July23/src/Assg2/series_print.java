package Assg2;
import java.util.*;
public class series_print {
	public static void series_print(int n, int m) {
		int i=1;
		while(i<=n) {
			int series=(3*i)+2;
			if(series%m==0) {
				i++;
				n++;
				continue;
			}
			else {
				System.out.println(series);
				i++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int m=input.nextInt();
		series_print(n,m);
	}

}
