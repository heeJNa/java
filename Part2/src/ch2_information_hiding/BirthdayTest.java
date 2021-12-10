package ch2_information_hiding;

public class BirthdayTest {

	public static void main(String[] args) {

		Birthday date = new Birthday();
		date.setYear(2021);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
	}

}
