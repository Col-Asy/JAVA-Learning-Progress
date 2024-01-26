package Assg2;
import java.util.*;
public class simple_input {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input=new Scanner(System.in);
		while(true) {
			int n=input.nextInt();
			sum+=n;
			if(sum>=0) {
				System.out.println(n);
			}
			else {
				break;
			}
		}
	}

}
