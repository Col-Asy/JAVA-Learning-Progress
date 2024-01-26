package Lec6;
import java.util.*;
public class typecasting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		System.out.println((int) (ch));
		ch++;// ch = (char)(ch+1);
		System.out.println(ch);
		ch = (char) (ch + 1);
		System.out.println(ch);
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println(ch);
	}

}
