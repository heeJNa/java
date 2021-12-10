package ch2_collabration;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus (int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스에 탑승하고 있는 승객은 총 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
