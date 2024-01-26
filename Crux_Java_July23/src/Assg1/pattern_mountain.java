package Assg1;
import java.util.*;

public class pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int j = i * 2; j < n * 2 - 1; j++) {
				System.out.print(" ");
			}
			for (int l = i; l >= 1; l--) {
				if (l == n) {
					continue;
				}
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
