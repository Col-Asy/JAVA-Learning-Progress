package Assg2;
import java.util.*;
public class count_digit {
	public static int length(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int[] separate_number(int n, int len) {
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i]=n%10;
			n/=10;
		}
		return arr;
	}
	
	public static int return_repeated(int[] arr, int n, int len) {
		int count=0;
		for(int i=0; i<len; i++){
			if(arr[i]==n) {
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int len=length(n);
		int[] arr=separate_number(n, len);
		System.out.println(return_repeated(arr, m, len));
	}

}
