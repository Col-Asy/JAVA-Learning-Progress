package Assg6;

import java.util.Scanner;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		printPath(sc.nextInt(), sc.nextInt(), "");
		System.out.println();
		System.out.println(count);
	}

	static int count = 0;

	static void printPath(int row, int col, String path) {
		if (row == 1 && col == 1) {
			System.out.print(path + " ");
			count++;
		}

		if (row > 1) {
			printPath(row - 1, col, path + "V");
		}

		if (col > 1) {
			printPath(row, col - 1, path + "H");
		}
	}
}
