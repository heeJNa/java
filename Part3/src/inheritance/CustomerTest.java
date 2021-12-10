package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"�̼���");
		//customerLee.setCustomerName("�̼���");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
			
			
		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		//customerKim.setCustomerName("������");
		//customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println();
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);

		
		System.out.println(customerLee.showCustomerInfo() + " ���ұݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo() + " ���ұݾ��� " + priceKim + "�� �Դϴ�.");
		System.out.println();

		//������ Ÿ���� Customer �̹Ƿ� ���� ���� ������ ������ �޼���� Customer�� ������ �޼�����
		Customer vc = new VIPCustomer(12345, "�������"); //��ĳ����
		vc.bonusPoint = 10000;
		int priceNo = vc.calcPrice(10000);	//VIPCustomer�ν��Ͻ��� �޼��尡 ����(���� �޼���)
		System.out.println(vc.showCustomerInfo() + " ���ұݾ��� " + priceNo  + "�� �Դϴ�.");

		
	}

}
