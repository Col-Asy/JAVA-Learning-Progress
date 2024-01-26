import java.util.*;
public class test {
	
	public static void main(String args[]) {
       int[][] n = {{12,3,4},{32,21,43}};
       for(int i=0; i<n.length; i++) {
    	   Arrays.sort(n[i]);
       }
       for(int i=0; i<n.length; i++) {
    	   for(int j=0; j<n[i].length; j++) {
    		   System.out.println(n[i][j]);
    	   }
       }
   }

}
