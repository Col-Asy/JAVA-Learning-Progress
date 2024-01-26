package Lec2;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<6) {
			int space=1;
			int star=6-i;
			while(space<i) {
				System.out.print("  ");
				space++;
			}
			while(star>=1) {
				System.out.print("* ");
				star--;
			}
			System.out.println();
			i++;
		}
		
	}

}
