package equals;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100,"Lee");
		Student std2 = new Student(100,"Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //equals 재정의함.
		
		System.out.println(std1 == std3);
		System.out.println(std1.equals(std3));
		
		System.out.println(std1.hashCode());	//hashcode 재정의함.
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1));	//실제 해쉬코드값을 알려줌.
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		
		System.out.println(i.hashCode()); //Integer은 그 값이 해쉬코드로 나옴.
		
		 Student copyStudent = (Student)std1.clone(); //인스턴스의 상태를 그대로 복제
		 	System.out.println(copyStudent);
			System.out.println(System.identityHashCode(std1));
			System.out.println(System.identityHashCode(copyStudent));

		

	}

}
