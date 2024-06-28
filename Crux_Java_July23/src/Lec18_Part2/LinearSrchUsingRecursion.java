package Lec18_Part2;

public class LinearSrchUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,14,17,45};
		int target = 46;
		System.out.println(searcher(arr, target, 0));
	}

	static boolean searcher(int[] arr, int target, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return false;
		}
		
		return (arr[i]==target) || searcher(arr, target, i+1);
	}

}
