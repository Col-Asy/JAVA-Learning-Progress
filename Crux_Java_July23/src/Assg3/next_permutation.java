package Assg3;
import java.util.*;
public class next_permutation {
	public static boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        
        return i >= 0;
    }

    public static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t-- > 0){
            int n = input.nextInt();	//Number of digits
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = input.nextInt();
            }
            
            if(nextPermutation(arr)){
                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                Arrays.sort(arr);
                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
	}

}
