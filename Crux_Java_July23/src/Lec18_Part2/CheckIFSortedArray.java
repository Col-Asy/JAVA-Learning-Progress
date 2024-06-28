package Lec18_Part2;

public class CheckIFSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,13,4,14,17,45};
//		int target = 46;
		
		System.out.println(checker(arr, 0));
	}

	private static boolean checker(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length-1) {
			return true;
		}
		
		return arr[i]<arr[i+1] && checker(arr, i+1);
	}

}
