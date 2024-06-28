package Assg6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 1, 2, 3 };

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		List<Integer> subset = new ArrayList<>();
		printSubSets(subset, target, arr, 0);
		System.out.println();
		System.out.println(count);

	}

	static int count = 0;
	
	static void printSubSets(List<Integer> subset, int tar, int[] arr, int idx) {
		if (idx == arr.length) {
			if (tar == 0) {
				for (int num : subset) {
					System.out.print(num + " ");
				}
				System.out.print(" ");
				count++;
			}
			return;
		}

		if (idx == arr.length) {
			System.out.println("0");
			return;
		}

		subset.add(arr[idx]);
		printSubSets(subset, tar - arr[idx], arr, idx + 1);
		subset.remove(subset.size() - 1);

		printSubSets(subset, tar, arr, idx + 1);

	}

}
