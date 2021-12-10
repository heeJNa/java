package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMeterial(powder);
		
		Powder p = (Powder)printer.getMeterial(); //object class를 사용할경우 강제로 형변환을 해줘야함
	}

}
