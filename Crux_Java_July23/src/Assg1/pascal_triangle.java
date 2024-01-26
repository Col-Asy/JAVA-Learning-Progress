package Assg1;
import java.util.*;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.print("\n");
		}

	}

}
