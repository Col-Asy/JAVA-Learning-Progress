package Assg5;
import java.util.*;
public class can_you_read_this_CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s=input.next();
		
//		String s = "IAmACompetitiveProgrammer";
		boolean condt=false;
        for (char c : s.toCharArray()) {
        	if (Character.isUpperCase(c)) {
                if(condt) {
                	System.out.println();
                }
                else {
                	condt=true;
                }
            }
        	
        	System.out.print(c);
        }
	}

}
