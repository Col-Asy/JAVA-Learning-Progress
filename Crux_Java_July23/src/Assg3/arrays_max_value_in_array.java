package Assg3;
import java.util.*;

public class arrays_max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		long min = Long.MIN_VALUE;
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			long temp=input.nextLong();
			arr[i]=temp;
			if(min<temp) {
				min=temp;
			}
		}
		
		System.out.println(min);
	}

}
