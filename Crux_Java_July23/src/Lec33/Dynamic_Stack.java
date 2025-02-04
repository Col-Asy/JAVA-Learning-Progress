package Lec33;

import Lec29.Stack;

public class Dynamic_Stack extends Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynamic_Stack ds = new Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);

		ds.display();
	}

	@Override
	public void push(int item) {
		try {
			if (isfull()) {
				int[] ar = new int[2 * arr.length];
				for (int i = 0; i < arr.length; i++) {
					ar[i] = arr[i];
				}
				arr = ar;
			}

			super.push(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
