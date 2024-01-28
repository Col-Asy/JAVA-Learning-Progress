package Assg5;

public class Length_of_longest_substring_without_repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABDEFGABEF";
		
		System.out.println(longestSubStr(str));
	}
	
	public static int longestSubStr(String str) {
		int n = str.length();
        int[] index = new int[128]; // ASCII size
        int maxLength = 0;
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[str.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            index[str.charAt(j)] = j + 1;
        }
        return maxLength;
	}

}
