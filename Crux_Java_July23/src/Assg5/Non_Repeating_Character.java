package Assg5;

import java.util.Scanner;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="abbc";
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			String str = sc.next();
			System.out.println(nonRepeatChar(str));;
		}
		
//		System.out.println(nonRepeatChar(str));;
		
		
	}
	
	public static char nonRepeatChar(String str) {
//		int count=0, i=0;
//		while (i<str.length()) {
//			for(int j=i; j<str.length(); j++) {
//				System.out.println(j);
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//				
//			}
//			if(count>2) {
//				break;
//			}
//			else {
//				count=0;
//				i++;
//			}
//		}
//		
//		System.out.println(str.charAt(i));
//		return 0;
		
		for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return str.charAt(i);
            }
        }
        return (char) -1;
    }
}
