package Assg3;

import java.util.Scanner;

public class max_circular_sum {
	public static int kadane(int[] arr){
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        
        for(int i=1; i<arr.length; i++){
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
        while(t>0){
            int n = input.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++) {
			    int j = input.nextInt();
			    arr[i] = j;
		    }
            int maxKadane = kadane(arr);
            int maxWrap = 0;

            for(int i=0; i<n; i++){
                maxWrap += arr[i];
                arr[i] = -arr[i];
            }
        
            maxWrap = maxWrap + kadane(arr);
        
            System.out.println(Math.max(maxKadane, maxWrap));

            t--;
        }
    
	}

}
