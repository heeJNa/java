package ch2_array;

public class BookCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		for(int i = 0; i< library.length; i++) {	//깊은복사
			copyLibaray[i].setTitle(library[i].getTitle());
			copyLibaray[i].setAuthor(library[i].getAuthor());
		}
		
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
	
		System.out.println("======library=========");
		for( Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
		
		System.out.println("======copy library=========");
		for( Book book : copyLibaray) {
			System.out.println(book);
			book.showBookInfo();
		}

	}

}
