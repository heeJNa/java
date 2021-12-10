package thread;

public class JoinTest extends Thread{
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public void run(){
	
		int i;
		for(i = start; i <= end; i++){
			total += i;
		}
	}

	public static void main(String[] args) {		//thread는 총 3개
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
				
		jt1.start();
		jt2.start();
		
		try{
			jt1.join();	//main thread가 jt1이 끝나길 기다림(main은 not-runnable)
			jt2.join();	//main thread가 jt1이 끝나길 기다림(main은 not-runnable)
			
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);

	}

}
