package Assg6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> ans = new ArrayList<>();
		generationParanthesis(n, 0, 0, "", ans);

		for (int i = ans.size() - 1; i >= 0; i--) {
			System.out.println(ans.get(i));
		}
	}

	private static void generationParanthesis(int n, int open, int close, String ans, List<String> ans1) {
		// TODO Auto-generated method stub
		if (open == n && close == n) {
			ans1.add(ans);
			return;
		}

		if (open < n) {
			generationParanthesis(n, open + 1, close, ans + '(', ans1);
		}
		if (close < open) {
			generationParanthesis(n, open, close + 1, ans + ')', ans1);
		}
	}

}
