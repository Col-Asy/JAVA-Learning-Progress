package Lec28;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My name is " + name + " and age is " + age);

	}

	public void SayHey(String name) {
//		Using name variable directly assigns the use case into the variable
//		While using this.name, it refers to the value stored already into the variable instead of any passed values into it
		System.out.println(this.name + " Say Hey to  " + name);

	}

	public static void SayMentor_Name() {
		
		System.out.println("Mentor Name Life");
		
	}
	
//	static block runs before the class usage
	static {
		System.out.println("This is static block");
	}

}
