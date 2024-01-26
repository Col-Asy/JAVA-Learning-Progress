package Lec16;

public class wrapper_class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 91;
		System.out.println(a);
		System.out.println(a1);
		// auto-boxing
		a1 = a;
		System.out.println(a==a1);
		int b = 11;
		Integer b1 = 189;
		// un-boxing
		b = b1;
		System.out.println(b==b1);

		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 189;
		Integer c4 = 189;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		
		// Cacehe value ranges from [-128, 127]
		// for wrapper class if its greater than this value separate value places will be assigned, else same positions will be assigned
	}

}
