package ch2_this;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("�̸�����", 1);	//�ٸ� �����ڸ� ȣ���ϴ� this
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person getPerson() {
		return this;
	}



}
