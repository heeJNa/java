package Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException { 
		
				Person person = new Person("James");	//1�� ���
				System.out.println(person);

				Class c1 = Class.forName("Class.Person");	//2�� ���
				Person person1 = (Person)c1.newInstance();
				person1.setName("heejun");
				System.out.println(person1);
				
				Class c2 = person.getClass();
				Person p =(Person)c2.newInstance();
				System.out.println(p);
				
				
				
				Class[] parameterTypes = {String.class};
				Constructor cons = c1.getConstructor(parameterTypes);
				

				Object[] initargs = {"������"};
				Person personLee = (Person)cons.newInstance(initargs);
				System.out.println(personLee);		
				//�� 5���� ������ Person kim = new Person("Kim")�� ����	 local�� Person�� ������ ���.


	}
}
