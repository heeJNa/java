package thread;

class Bank {

	private int money = 10000;

	public void saveMoney(int save) {	
		
		synchronized (this) {	//this를 락을 검 
			
			int m = getMoney();
			
			try {
				Thread.sleep(3000);	// sleep()은 Thread의 static 메소드이다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
		
	}

	public synchronized void minusMoney(int minus) { //이 메소드가 실행되는동안 이 객체에 lock을 건다.

		int m = getMoney();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread{
	
	public void run() {
	//	synchronized (SyncMain.myBank) {	//누구를 락을 걸것인지 정한다. synchronized block방식
			
			System.out.println("start save");
			SyncMain.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
		//}
	}
}

class ParkWife extends Thread{
	
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();		//이 static멤버 변수는 class SyncMain의 변수인가 ?  그렇다면 bank클래스도 이때 같이 메모리에 할당 되는가 ?

	public static void main(String[] args) {
		
		Park p = new Park();
		ParkWife pw = new ParkWife();
		pw.start();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
