package Lec2;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int j=1;
		while(i<6) {
			int star=9;
			int space=2;
			while(space<=i) {
				System.out.print("  ");
				space++;
			}
			while(star>=j) {
				System.out.print("* ");
				star--;
			}
			System.out.println();
			j+=2;
			i++;
		}
		
	}

}
