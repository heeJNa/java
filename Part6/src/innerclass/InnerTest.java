package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	class InClass{
		int iNum=100;
		static int sInNum =  10;
		
		void InTest() {	//내부클래스, 외부클래스의 private변수도 사용가능
			System.out.println("OutClass num = " +sInNum + "(내부 클래스의 스태틱 변수)");
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

		}
	}
	
	public void usingClass() {
		inClass.InTest();
	}
	
	static class InStaticClass{
		
		int iNum = 100;
		static int sInNum=200;
		
		void InTest() {	
			//System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)"); 사용불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");

		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			//System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)"); 사용불가
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
	}
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		
		System.out.println();
		OutClass.InClass inner = outClass.new InClass();
		inner.InTest();
		
		System.out.println();
		OutClass.InStaticClass sInCalss = new OutClass.InStaticClass();
		sInCalss.InTest();
		
		System.out.println();
		OutClass.InStaticClass.sTest();
	}

}
