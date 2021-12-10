package ch2_array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		library.remove(3);
		System.out.println(library.get(3));
		System.out.println(library.isEmpty());
		
		for(int i =0; i<library.size(); i++) {
			library.get(i).showBookInfo();
		}

	}

}
