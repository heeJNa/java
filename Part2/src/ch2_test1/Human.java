package ch2_test1;

public class Human {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	private String sex;
	
	public Human(String name, int age, int height, int weight, String sex) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
	}
	
	public void HumanInfo() {
		System.out.println("Ű�� " + height + "�̰� �����԰� " + weight + "ų���� " + sex + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age +"�� �Դϴ�.");
	}
}
