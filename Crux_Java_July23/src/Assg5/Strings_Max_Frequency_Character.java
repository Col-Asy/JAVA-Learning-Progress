package Assg5;
import java.util.*;
public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "aaabacb";
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
        System.out.println(getMaxFrequencyChar(str));
    }

    public static char getMaxFrequencyChar(String str) {
        int maxCount = 0;
        char maxChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }

}
