package Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException { 
		
				Person person = new Person("James");	//1번 방법
				System.out.println(person);

				Class c1 = Class.forName("Class.Person");	//2번 방법
				Person person1 = (Person)c1.newInstance();
				person1.setName("heejun");
				System.out.println(person1);
				
				Class c2 = person.getClass();
				Person p =(Person)c2.newInstance();
				System.out.println(p);
				
				
				
				Class[] parameterTypes = {String.class};
				Constructor cons = c1.getConstructor(parameterTypes);
				

				Object[] initargs = {"김유신"};
				Person personLee = (Person)cons.newInstance(initargs);
				System.out.println(personLee);		
				//위 5줄의 과정은 Person kim = new Person("Kim")과 같음	 local에 Person이 없을때 사용.


	}
}
