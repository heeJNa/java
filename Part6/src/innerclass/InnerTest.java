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
		
		void InTest() {	//����Ŭ����, �ܺ�Ŭ������ private������ ��밡��
			System.out.println("OutClass num = " +sInNum + "(���� Ŭ������ ����ƽ ����)");
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");

		}
	}
	
	public void usingClass() {
		inClass.InTest();
	}
	
	static class InStaticClass{
		
		int iNum = 100;
		static int sInNum=200;
		
		void InTest() {	
			//System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)"); ���Ұ�
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");

		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			//System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)"); ���Ұ�
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
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
