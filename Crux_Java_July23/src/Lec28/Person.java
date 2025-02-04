package Lec28;

public class Person {
	private String name = "Kaju";
	private int age = 17;
	
//	if creating a new constructor, need to initialize the process by defining a blank constructor
//	this blank constructor is automatically made by the jdk (system)
//	this is done becoz, when we r declaring new constructor, it overwrites the old one, which was supposed to contain the default values
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
}
