package ex01;

public class Student extends Person{
	private String school;
	
	Student() {}
	Student(String name, int age, String school) {
		super(name,age);
		this.school = school;
	}
	
	public void study() {
		System.out.println(school + "에서 공부 중입니다.");
	}
}
