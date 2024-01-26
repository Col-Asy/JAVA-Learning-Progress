package Lec6;
import java.util.*;
public class inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			System.out.println("Sum before is: "+sum);
			System.out.println("Pos before is: "+pos);
			System.out.println("n before is: "+n);
			System.out.println("rem before is: "+rem);
			// sum = (int) (sum + pos * Math.pow(10, rem - 1));
			sum += pos * Math.pow(10, rem - 1);
			n = n / 10;
			pos++;
			System.out.println();
			System.out.println("Sum after is: "+sum);
			System.out.println("Pos after is: "+pos);
			System.out.println("n after is: "+n);
			System.out.println("rem after is: "+rem);
			System.out.println();
		}
		System.out.println(sum);
	}

}
