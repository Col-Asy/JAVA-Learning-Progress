package Lec31;

public class Client {
	public static void main(String[] args) {
		// Case-1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();
		
		
		
		// Case-2
//		P obj = new C();
//		System.out.println(obj.d); // 2
//		System.out.println(obj.d2); // 20
//		System.out.println(((C) (obj)).d1); // 10
//		System.out.println(((C) (obj)).d); // 1
//		
//		obj.fun(); // Fun in C -> happens becoz of method overriding
//		obj.fun2(); // Fun2 in P
//		((C) (obj)).fun1(); // Fun1 in C
//		((P) (obj)).fun(); // Fun in C -> happens becoz of method overriding
		
		
		
		// Case-3 (not eligible)
//		C obj = new P(); // Parent class has no right to access children class hence error
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2); // hence these aren't accessible
//		// therefore giving compile time error as compile time error is better than runtime error
//		// although no error is good, but this way able to correct firsthand only
//		// hence not eligible
		
		
		
		// Case-4
		C obj = new C();
		System.out.println(obj.d); // 2
		System.out.println(obj.d2); // 20
		System.out.println(obj.d1); // 10 // no need for overriding
		System.out.println(((P)(obj)).d); // 1
		
		obj.fun();
		obj.fun1();
		obj.fun2();
		((P)(obj)).fun(); // will return for C class only, type casting doesn't work
	}

}
