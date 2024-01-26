package Lec2;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<6) {
			int star=1;
			int space=4;
			while(space>=i) {
				System.out.print(" ");
				space--;
			}
			while(star<=i) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}
		
	}

}
