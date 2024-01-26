package Assg2;
import java.util.*;

public class chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        String x = input.next();

        char[] digits = x.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > '4')
                digits[i] = (char) ('9' - digits[i] + '0');
        }

        if (digits[0] == '0')
            digits[0] = '9';
        
        System.out.println(new String(digits));
        
	}

}
