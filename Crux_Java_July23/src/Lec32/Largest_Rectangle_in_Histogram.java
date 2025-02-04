package Lec32;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(LargestArea(arr));
	}

	private static int LargestArea(int[] arr) {
		int area = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int w = i;
				if (st.isEmpty())
					area = Math.max(area, h * w);
				else {
					int l = st.peek();
					area = Math.max(area, h * (w - l - 1));
				}
			}
			st.push(i);
		}

		int w = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty())
				area = Math.max(area, h * w);
			else {
				int l = st.peek();
				area = Math.max(area, h * (w - l - 1));
			}
		}
		return area;
	}

}
