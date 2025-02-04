package Lec28;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
//		Now the static block will be called before the execution of the class call
		
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Christopher";
		s.age = 18;
		s.Intro_yourSelf();
		
		Student.SayMentor_Name();

	}
//	method-2 for static block-
	static {
		System.out.println("Static block in Main");
	}

}
