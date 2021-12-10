package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
		
	Runnable getRunnable(int i){

		int num = 100;
		
		//class MyRunnable implements Runnable{	//지역 내부 클래스
		return new Runnable() {	//익명 내부 클래스
			int localNum = 10;
				
			@Override
			public void run() {
				//num = 200;   //에러 남. 지역변수는 상수로 바뀜
				//i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
				localNum = 20;
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				}
			};
		// return new MyRunnable();
	}
	
	Runnable runnable = new Runnable() {	//익명 내부 클래스 사용
		
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

