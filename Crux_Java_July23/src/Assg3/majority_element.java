package Assg3;

import java.util.Scanner;

public class majority_element {
	public static void majElemt(int[]arr) {
		int majorityElement = -1;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > arr.length/2){
                majorityElement = arr[i];
                break;
            }
        }
        
        System.out.println(majorityElement);
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
		
		majElemt(arr);
		
	}

}
