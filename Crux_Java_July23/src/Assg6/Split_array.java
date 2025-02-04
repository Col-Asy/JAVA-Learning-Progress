package Assg6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Split_array {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> g1 = new ArrayList<>();
		List<Integer> g2 = new ArrayList<>();
		count = 0;
		checkSum(arr, 0, g1, g2, 0, 0);
		System.out.println(count);
	}

	private static void checkSum(int[] arr, int idx, List<Integer> g1, List<Integer> g2, int s1, int s2) {
		// TODO Auto-generated method stub
		if (idx == arr.length) {
			if (s1 == s2) {
				for (int i = 0; i < g1.size(); i++) {
					System.out.print(g1.get(i) + " ");
				}
				System.out.print("and");
				for (int i = 0; i < g2.size(); i++) {
					System.out.print(" " + g2.get(i));
				}
				System.out.println();
				count++;
			}
			;
			return;
		}

		g1.add(arr[idx]);
		checkSum(arr, idx + 1, g1, g2, s1 + arr[idx], s2);
		g1.remove(g1.size() - 1);

		g2.add(arr[idx]);
		checkSum(arr, idx + 1, g1, g2, s1, s2 + arr[idx]);
		g2.remove(g2.size() - 1);
	}

}
