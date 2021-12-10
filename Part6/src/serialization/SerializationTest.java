package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{  //Externalizable ���� �а��� �ڵ� ����
	String name;
	transient String job; //����ȭ ����(���� ����)
	
	public Person() {
		
	}
	
	public Person(String name, String job) {
		this.job = job;
		this.name = name;
	}
	
	public String toString() {
		return name + "," + job;
	}

	/*
	 * @Override public void writeExternal(ObjectOutput out) throws IOException {
	 * out.writeUTF(name); out.writeUTF(job);
	 * 
	 * 
	 * }
	 * 
	 * @Override public void readExternal(ObjectInput in) throws IOException,
	 * ClassNotFoundException { name = in.readUTF(); job = in.readUTF(); //�Ⱦ����� �ּ�
	 * ó�� }
	 */
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("�̼���", "��ǥ�̻�");
		Person personKim = new Person("������", "���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			
			
			System.out.println(pLee);
			System.out.println(pKim);
		}catch(IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
