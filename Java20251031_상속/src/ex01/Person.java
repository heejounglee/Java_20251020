package ex01;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + "은 점심을 먹는다.");
	}
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	} 
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	} */
	
	@Override
	public String toString () {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	
	
	
}
