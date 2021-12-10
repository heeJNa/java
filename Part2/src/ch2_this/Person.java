package ch2_this;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);	//다른 생성자를 호출하는 this
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person getPerson() {
		return this;
	}



}
