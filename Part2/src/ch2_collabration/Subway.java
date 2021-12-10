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
		System.out.println(lineNumber + "호선 지하첼에 탑승하고 있는 승객은 총 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
