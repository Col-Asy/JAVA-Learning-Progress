package Lec29;

public class Student {
	
	private String name = "Kaju";
	private int age = 17;
	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
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
//	public void setAge(int age) throws Exception {
//		if(age<0) {
//			throw new Exception("age can't be -ve");
//		}
//		this.age = age;
//	}
	
	public void setAge(int age) {
		try {
			if(age<0) {
				throw new Exception("age can't be -ve");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("I'm in finally block");
//			System.exit(0); <- used to terminate the code
		}
	}

}
