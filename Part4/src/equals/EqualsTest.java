package equals;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100,"Lee");
		Student std2 = new Student(100,"Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //equals ��������.
		
		System.out.println(std1 == std3);
		System.out.println(std1.equals(std3));
		
		System.out.println(std1.hashCode());	//hashcode ��������.
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1));	//���� �ؽ��ڵ尪�� �˷���.
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		
		System.out.println(i.hashCode()); //Integer�� �� ���� �ؽ��ڵ�� ����.
		
		 Student copyStudent = (Student)std1.clone(); //�ν��Ͻ��� ���¸� �״�� ����
		 	System.out.println(copyStudent);
			System.out.println(System.identityHashCode(std1));
			System.out.println(System.identityHashCode(copyStudent));

		

	}

}
