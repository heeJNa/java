package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double salesRatio;
	
	/*public VIPCustomer() {
	 	super(); //묵시적으로 호출됨.
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);	//명시적 호출
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	
	
	
	public int getAgentID() {
		return agentID;
	}

}
