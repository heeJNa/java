package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double salesRatio;
	
	/*public VIPCustomer() {
	 	super(); //���������� ȣ���.
		customerGrade = "VIP";    //���� �߻�
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	//����� ȣ��
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
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�";  
}
	public int getAgentID() {
		return agentID;
	}

}
