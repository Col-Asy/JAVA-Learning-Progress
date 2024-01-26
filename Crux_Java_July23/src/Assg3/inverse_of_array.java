package Assg3;
import java.util.*;
public class inverse_of_array {
	public static int[] inverse(int[] arr) {

        int[] narr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            narr[arr[i]] = i;
        }

        return narr;
      
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mix[] = new int[n];
        for (int i = 0; i < mix.length; i++) {
            mix[i] = sc.nextInt();
        }
        mix = inverse(mix);
        for (int i = 0; i < n; i++) {
            System.out.print(mix[i] + " ") ;
        }



	}

}
