package Lec17;

public class subArray_prodct_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(Product_Less_Than_K(arr, k));

	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while (ei < arr.length) {
			// growing
			p = p * arr[ei];
			// shrinking
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}
			// cal
			ans = ans + (ei - si + 1);
			ei++;
			System.out.println("ans: "+ans);
			System.out.println("p: "+p);
		}
		return ans;

	}


}
