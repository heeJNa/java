package ch2_collabration;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "ȣ�� ����ÿ�� ž���ϰ� �ִ� �°��� �� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}

}
