package Lec31;

public class Sum_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2,3));
		System.out.println(Add(2,3,11));
		System.out.println(Add(2,3,8.9));
		System.out.println(Add(2,3,4,3,2,3,1,4,3,3));
	}
	
	public static int Add(int a, int b) {
		return a+b;
	}
	
	public static int Add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int Add(int a, int b, double c) {
		return (int)(a+b+c);
	}
	
	public static int Add(int x, int... arr) { // ... is used to take data in bulk and any data that is to be taken before the bulk, should be specified before as x's value is taken before
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}

}
