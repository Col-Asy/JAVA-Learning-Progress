package Assg1;
import java.util.*;

public class pattern_triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int no = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("\t");
			}
			
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(no + "\t");
				if (j < i) {
					no++;
				} else {
					no--;
				}
			}
			System.out.println();
			no = i + 1;
		}
	}

}
