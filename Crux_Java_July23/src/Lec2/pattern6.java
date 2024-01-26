package Lec2;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int j=0;
		while(i<6) {
			int star=6-i;
			int space=0;
			while(space<j) {
				System.out.print("  ");
				space++;
			}
			while(star>=1) {
				System.out.print("* ");
				star--;
			}
			System.out.println();
			i++;
			j+=2;
		}
		
		
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
//		}
	}

}
