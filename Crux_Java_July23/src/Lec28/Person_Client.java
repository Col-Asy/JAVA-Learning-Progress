package Lec28;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
//		This will not work now as the fields are private
//		System.out.println(p.name);
//		System.out.println(p.age);
		System.out.println(p.getAge());
		
		Person p1 = new Person("Raj", 24);
//		This will not work now as the fields are private
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		p1.setAge(19);
		System.out.println(p1.getAge());
	}

}
