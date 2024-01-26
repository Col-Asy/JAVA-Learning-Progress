package Lec17;

public class maximum_subArray_size_of_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 4, 5 };
		int k = 3;
		System.out.println(MaxSum(arr, k));

	}

	public static int MaxSum(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
//		System.out.println("ans:"+ans+"  sum:"+sum);

		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// grow
//			System.out.println(sum);
			sum -= arr[i - k];// shrink
//			System.out.println(sum);
			ans = Math.max(ans, sum);
//			System.out.println(ans);
		}
		return ans;
	}

}
