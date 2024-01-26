package Assg3;
import java.util.*;
public class array_reverse_array {
	public static long[] reverse_arr(long[] arr) {
		int start=0, end=arr.length-1;
		while(start<end) {
			long temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		
			start++;
			end--;
		}
		
		return arr;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			long temp=input.nextLong();
			arr[i]=temp;
		}
		
		
//		System.out.println((Arrays.toString(reverse_arr(arr))));
		long[] arr_new=reverse_arr(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr_new[i]);
		}
	}

}
