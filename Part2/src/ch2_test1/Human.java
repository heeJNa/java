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
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + sex + "이 있습니다. 이름은 " + name + "이고 나이는 " + age +"살 입니다.");
	}
}
