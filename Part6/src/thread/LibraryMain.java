package thread;

import java.util.ArrayList;

class FastLibrary {

	public ArrayList<String> shelf = new ArrayList<>();

	public FastLibrary() {
		shelf.add("�¹���1");
		shelf.add("�¹���2");
		shelf.add("�¹���3");
//		shelf.add("�¹���4");
//		shelf.add("�¹���5");
//		shelf.add("�¹���6");
	}

	public synchronized String lendBook() throws InterruptedException {

		Thread t = Thread.currentThread(); // �޼ҵ带 �����ϰ� �ִ� Thread������ ����
		while(shelf.size() == 0) {	//å�� �ϳ��� ���� �ٽ� wait ���°� ��
			System.out.println(t.getName() + "waiting start");
			wait();	//�� �޼ҵ带 �����ϰ� �ִ� Thread���� non runnable ���·� ����
			System.out.println(t.getName() + "waiting end");
		}
		if (shelf.size() >  0) {
		

			String book = shelf.remove(0);
			System.out.println(t.getName() + " : " + book + "lend");
			return book;
		} else
			return null;

	}

	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();

		shelf.add(book);
		notifyAll(); //�������� ��찡 �߻��� �� ����. �׷��� �ٽ� wait()�� ��Ŵ
		System.out.println(t.getName() + " : " + book + "return");
	}
}

class Student extends Thread {

	public Student(String name) {
		super(name);	//Thread name
	}

	public void run() {

		try {
			String title = LibraryMain.library.lendBook();
			if (title == null) {
				System.out.println(getName() + "������ ������");
				return;
			}
			sleep(5000); // å�� ������ 5�� �а� �ݳ�
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

/*
 * notify()�� ����� ��� ������ �Ҹ��� ���� ���ϴ� Thread�� ���� ���� �ֱ� ������ notifyAll()�޼ҵ带 ���� ���
 * ������ race condition���·� ����� �����ϰ� �Ѵ�. ���ҽ��� ã�� ������ polling�̶� �Ѵ�.
 */
public class LibraryMain {
	public static FastLibrary library = new FastLibrary();

	public static void main(String[] args) {
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");

		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}
