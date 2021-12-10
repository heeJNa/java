package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
		
	Runnable getRunnable(int i){

		int num = 100;
		
		//class MyRunnable implements Runnable{	//���� ���� Ŭ����
		return new Runnable() {	//�͸� ���� Ŭ����
			int localNum = 10;
				
			@Override
			public void run() {
				//num = 200;   //���� ��. ���������� ����� �ٲ�
				//i = 100;     //���� ��. �Ű� ���� ���� ��������ó�� ����� �ٲ�
				localNum = 20;
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
				}
			};
		// return new MyRunnable();
	}
	
	Runnable runnable = new Runnable() {	//�͸� ���� Ŭ���� ���
		
		@Override
		public void run() {
			
			System.out.println("Runnalbe class");
		}
	};
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		out.runnable.run();
	}
}

