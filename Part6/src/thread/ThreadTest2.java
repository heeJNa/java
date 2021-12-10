package thread;

class MyTh implements Runnable{
	
	@Override
	public void run() {	//thread가 시작되면 불리는 함수 
		
		int i;
		for(i = 0; i<200; i++) {
			System.out.print(i + "\t");
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		
		MyTh runnable = new MyTh();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		run.run();
	}

}
