package Assg4;
import java.util.*;
public class mummy_motivational_speech {
	public static boolean isTrue(int[][]arr) {
		int collSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]!=0) {
					sum+=1;
				}
			}
			if(sum==i+1) {
				collSum++;
			}
		}
		if(collSum==(arr.length)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input=new Scanner(System.in);
//		int n = input.nextInt();// row
//		int[][] arr = new int[n][n];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j] = input.nextInt();
//			}
//		}
		int[][] arr = {{1,0,0,0},{1,2,0,0},{1,2,3,0},{1,2,3,4}};
		System.out.println(isTrue(arr));
	}

}
