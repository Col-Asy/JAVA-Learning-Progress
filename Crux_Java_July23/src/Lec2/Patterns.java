package Lec2;
//import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=0;
//		while (i<6) {
//			i++;
//			System.out.println("*");
//		}
//	}

//		Question 2
//		int i=1;
//		while (i<6) {
//			int j=1;
//			while (j<=i) {
//				System.out.print("* ");
//				j++;
//			System.out.println("");
//			i++;
//			}
//		}		

//	Question 4
//		int row=1;
//		int star=1;
//		int space=5;
//		
//		while (row<6) {
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while(j<=star) {
//				System.out.print("* ");
//				j++;
//			}
//			System.out.println();
//			row++;
//			star++;
//			space--;
//		}

//		Question 6
//		int row=1;
//		int space=0;
//		int star=5;
//		
//		while (row<6) {
//			int i=0;
//			while (i<space) {
//				System.out.print("  ");
//				i++;
//			}
//			int j=1;
//			while (j<=star) {
//				System.out.print(" *");
//				j++;
//			}
//			System.out.println();
//			row++;
//			space+=2;
//			star--;
//			
//		}

//		Question 7
//		int input = 5;
//		int space = 0;
//		int row = 1;
//		if (input % 2 == 0) {
//			space = row - 1;
//		} else {
//			space = row / 2;
//		}
//
//		int star = 1;
//		row = 1;
//		while (row < input) {
//			int i = 0;
//			while (i <= space) {
//				System.out.print("  ");
//				i++;
//			}
//
//			i = 0;
//			while (i < star) {
//				System.out.print("* ");
//				i++;
//			}
//
//			System.out.println();
//			space--;
//			star += 2;
//			row += 1;
//		}

		
		
//		Hacker Block Assignment
//		Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        int n = input.nextInt();
//        input.close();
//        
        // An array to store the previous row
//        int[] prev = new int[n];
//        
//        // Loop through each row
//        for (int i = 0; i < n; i++) {
//            // An array to store the current row
//            int[] curr = new int[i + 1];
//            
//            // Loop through each element in the row
//            for (int j = 0; j <= i; j++) {
//                // The first and last element are always 1
//                if (j == 0 || j == i) {
//                    curr[j] = 1;
//                } else {
//                    // The other elements are the sum of the two elements above them
//                    curr[j] = prev[j - 1] + prev[j];
//                }
//                
//                // Print the element with a space
//                System.out.print(curr[j] + " ");
//            }
//            
//            // Print a new line
//            System.out.println();
//            
//            // Update the previous row with the current row
//            prev = curr;
		
		
		
	}
}
