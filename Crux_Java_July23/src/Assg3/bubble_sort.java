package Assg3;
import java.util.*;
public class bubble_sort {
	public static void print_array(long[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void bubble_srt(long[] arr) {
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					long temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		print_array(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			long j = input.nextLong();
			arr[i] = j;
		}
		
		bubble_srt(arr);
	}

}
