package Assg5;

import java.util.*;

public class Form_Biggest_Number {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {54, 546, 548, 60};
//		
//		System.out.println(biggestNum(arr));
//	}
//	
//	public static String biggestNum(int[] arr) {
//		Arrays.sort(arr);
//		String strNew = "";
//		for(int i=0; i<arr.length; i++) {
//			strNew+= Integer.toString(arr[i]);
//		}
//		
//		return strNew;
//	}
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr, new Comparator<String>() {
                public int compare(String a, String b) {
                    String order1 = a + b;
                    String order2 = b + a;
                    return order2.compareTo(order1); // sort in descending order
                }
            });
            for(String str : arr) {
                System.out.print(str);
            }
            System.out.println();
        }
        sc.close();
    }

}
