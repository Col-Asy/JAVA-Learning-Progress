package Lec2;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5; // need not change
		int i = 1;
		while (i < row+1) {
			if (i == 1 || i == row) {
				int star = 1;
				while (star <= row) {
					System.out.print("* ");
					star++;
				}
				System.out.println();
			} else {
				int pointer = 1;
				while(pointer<=row) {
					if (pointer == 1 || pointer == row) {
						System.out.print("* ");
						pointer++;
					} 
					else {
						while (pointer < row) {
							System.out.print("  ");
							pointer++;
						}
					}
				}
				System.out.println();
			}
			i++;
		}

	}

}
