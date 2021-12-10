package thread;

import java.util.ArrayList;

class FastLibrary {

	public ArrayList<String> shelf = new ArrayList<>();

	public FastLibrary() {
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
//		shelf.add("태백산맥4");
//		shelf.add("태백산맥5");
//		shelf.add("태백산맥6");
	}

	public synchronized String lendBook() throws InterruptedException {

		Thread t = Thread.currentThread(); // 메소드를 수행하고 있는 Thread정보를 받음
		while(shelf.size() == 0) {	//책이 하나도 없음 다시 wait 상태가 됨
			System.out.println(t.getName() + "waiting start");
			wait();	//이 메소드를 실행하고 있는 Thread들을 non runnable 상태로 만듬
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
		notifyAll(); //못빌리는 경우가 발생할 수 있음. 그럴때 다시 wait()을 시킴
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
				System.out.println(getName() + "빌리지 못했음");
				return;
			}
			sleep(5000); // 책을 빌려서 5초 읽고 반납
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

/*
 * notify()만 사용할 경우 영원히 불림을 받지 못하는 Thread가 생길 수도 있기 때문에 notifyAll()메소드를 통해 모두
 * 깨운후 race condition상태로 만들어 경쟁하게 한다. 리소스를 찾는 과정은 polling이라 한다.
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
