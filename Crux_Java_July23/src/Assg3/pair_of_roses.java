package Assg3;
import java.util.*;
public class pair_of_roses {
	public static void rosePair(int[] arr, int n) {
		int i = 0, j = arr.length-1;
        
		int min_i = 0, min_j = j; // to store the pair of roses with minimum difference
        
        while(i < j){
            if(arr[i] + arr[j] == n){
                if(arr[min_j] - arr[min_i] > arr[j] - arr[i]){
                    min_i = i;
                    min_j = j;
                }
                j--;
            } 
            
            else if(arr[i] + arr[j] < n){
                i++;
            }
            
            else {
                j--;
            }
        }
        
        System.out.println("Deepak should buy roses whose prices are " + arr[min_i] + " and " + arr[min_j] + ".");
   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t > 0){            
            int n = input.nextInt();			//the number of roses
            
            int[] roses_price = new int[n];
            
            for(int i=0; i<n; i++){
                roses_price[i] = input.nextInt();	//prices of the roses
            }
            
            int money = input.nextInt();		//the amount of money Deepak has
            Arrays.sort(roses_price);
            rosePair(roses_price, money);
            System.out.println();
            t--;
        }
	}

}
