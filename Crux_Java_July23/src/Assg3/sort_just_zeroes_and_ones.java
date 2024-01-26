package Assg3;
import java.util.*;
public class sort_just_zeroes_and_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(), sum_0=0, sum_1=0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
			if(arr[i]==0) {
				sum_0+=1;
			}
			else {
				sum_1+=1;
			}
		}
		
		for(int i=0; i<sum_0; i++) {
			System.out.print(0+ " ");
		}
		for(int i=0; i<sum_1; i++) {
			System.out.print(1+ " ");
		}
		
		System.out.println();
	}

}
