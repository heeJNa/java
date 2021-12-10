package ch2_this;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);

	}

}
