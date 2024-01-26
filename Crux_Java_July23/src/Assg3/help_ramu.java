package Assg3;
import java.util.*;
public class help_ramu {
	public static int findMinCost(int[] rides, int c1, int c2){
        int cost = 0;
        
        for(int ride : rides){
            cost += Math.min(ride * c1, c2);
        }
        
        return cost;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        
        int t = input.nextInt();
        while(t-- > 0){
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            
            
            int n = input.nextInt();				//Rickshaws
            int m = input.nextInt();				//Cabs
            
            int[] rickshaws = new int[n];			//Number of rides in rickshaw
            for(int i=0; i<n; i++){
                rickshaws[i] = input.nextInt();
            }
            
            int[] cabs = new int[m];				//Number of rides in cab
            for(int i=0; i<m; i++){
                cabs[i] = input.nextInt();
            }
            
            int rickshawCost = findMinCost(rickshaws, c1, c2);
            int cabCost = findMinCost(cabs, c1, c2);
            
            int totalCost = Math.min(c3, rickshawCost) + Math.min(c3, cabCost);
            
            totalCost = Math.min(totalCost, c4);
            
            System.out.println(totalCost);
        }
    }
	
}
