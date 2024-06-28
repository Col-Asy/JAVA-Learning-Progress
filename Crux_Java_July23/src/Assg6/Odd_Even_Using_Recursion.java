package Assg6;

public class Odd_Even_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
//		printSeries(n);
//		printSeriesEven(2,n);

		printSeries(n);
	}

	static void printSeries(int n) {
		if (n < 0) {
			return;
		}

		if (n % 2 != 0) {
			System.out.println(n);
			printSeries(n - 1);
		}

		else {
			printSeries(n - 1);
			if (n != 0) {
				System.out.println(n);
			}
		}
	}

//	static void printSeries(int n) {
//		if(n<1) {
//			return;
//		}
//		
//		System.out.println(n);
//		printSeries(n-2);
//	}
//	
//	static void printSeriesEven(int i, int n) {
//		if(i>n) {
//			return;
//		}
//		
//		System.out.println(i);
//		printSeriesEven(i+2, n);
//	}

}
