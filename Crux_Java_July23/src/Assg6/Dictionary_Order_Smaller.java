package Assg6;

import java.util.*;

public class Dictionary_Order_Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String originalStr = sc.nextLine();
//		String originalStr = "bca";

        char[] chars = originalStr.toCharArray();

        java.util.Arrays.sort(chars);

        sort(chars, 0, originalStr);
        sc.close();
    }

    private static void sort(char[] chars, int currentIndex, String originalStr) {
        if (currentIndex == chars.length - 1) {
            String resultString = new String(chars);
            if (resultString.compareTo(originalStr) < 0) {
                System.out.println(resultString);;
            }
            return;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            sort(chars, currentIndex + 1, originalStr);
            swap(chars, currentIndex, i);
        }
    }
    
    private static void swap(char[] chars, int i, int j) {
        if (i == j) return; // No need to swap identical indices
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}