package Lec15;

public class check_palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naan";
		System.out.println(IsPalindrom(s));
	}

	public static boolean IsPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}


}
