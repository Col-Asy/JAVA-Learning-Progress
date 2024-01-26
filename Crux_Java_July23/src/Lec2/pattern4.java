package Lec2;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<6) {
			int space=5-i;
			int star=1;
			while(space>=1) {
				System.out.print("  ");
				space--;
			}
			while(star<=i) {
				System.out.print("* ");
				star++;
			}
			System.out.println();
			i++;
		}
		
	}

}
