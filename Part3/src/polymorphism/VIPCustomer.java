package polymorphism;

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
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	//명시적 호출
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	@Override
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";  
}
	public int getAgentID() {
		return agentID;
	}

}
