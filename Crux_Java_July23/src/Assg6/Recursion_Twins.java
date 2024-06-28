package Assg6;

public class Recursion_Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "AXAXA"; // Replace with your input string
	    System.out.println(countTwins(input, 0));
	}
	
	static int countTwins(String str, int strIndex) {
		if (strIndex >= str.length() - 2) {
			return 0;
		}
		
		char currentChar = str.charAt(strIndex);
		char nextChar = str.charAt(strIndex+2);
		
		if (currentChar == nextChar) {
			return 1 + countTwins(str, strIndex + 1);
		}
		
		else {
			return countTwins(str, strIndex + 1);
		}
	}

}
