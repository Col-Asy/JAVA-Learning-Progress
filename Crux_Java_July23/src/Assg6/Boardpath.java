package Assg6;

import java.util.ArrayList;
import java.util.Scanner;

public class Boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> paths = new ArrayList<>();
		
		printBoardPath(3, 3, paths);
		System.out.println();
		System.out.println(countBoardPath(3, 3));
	}

	static void printBoardPath(int n, int m, ArrayList<Integer> paths) {
		// TODO Auto-generated method stub
		
		if (n<=0) {
			for (Integer integer : paths) {
				System.out.print(integer);
			}
			System.out.print(" ");
			return;
		}

		for (int i = 1; i <= m; i++) {
			if (n - i >= 0) {
				paths.add(i);
				printBoardPath(n - i, m, paths);

				paths.remove(paths.size() - 1);
			}
		}
	}
	
	static int countBoardPath(int n, int m) {
		// TODO Auto-generated method stub
		if (n<=0) {
			return 1;
		}
		int count =0;
		for (int i = 1; i <= m; i++) {
			if (n-i>=0) {
				count+=countBoardPath(n-i, m);
			}
			
		}
		
		return count;
	}
}
