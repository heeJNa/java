package inheritance;

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
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);	//����� ȣ��
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
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
