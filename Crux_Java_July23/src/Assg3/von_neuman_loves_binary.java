package Assg3;

import java.util.Scanner;

public class von_neuman_loves_binary {
	public static void decToBin(int n) {
		int decimal = 0;
        int base = 1;
        
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            decimal += lastDigit * base;
            base = base * 2;
        }
        System.out.println(decimal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			int j = input.nextInt();
			arr[i] = j;
		}
		
		for(int i=0; i<n; i++) {
			decToBin(arr[i]);
		}
	}

}
