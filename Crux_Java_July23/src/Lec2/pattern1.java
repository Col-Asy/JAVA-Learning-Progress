package Lec2;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while (i<6) {						//6 represents row number
			int j=0;						//j for number of stars
			while(j<5) {					//printing '*' x5
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println("");
		}
			
		
	}

}
