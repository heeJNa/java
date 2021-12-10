package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		//customerLee.setCustomerName("이순신");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
			
			
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		//customerKim.setCustomerName("김유신");
		//customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println();
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);

		
		System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
		System.out.println();

		//변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임
		Customer vc = new VIPCustomer(12345, "세종대왕"); //업캐스팅
		vc.bonusPoint = 10000;
		int priceNo = vc.calcPrice(10000);	//VIPCustomer인스턴스의 메서드가 사용됨(가상 메서드)
		System.out.println(vc.showCustomerInfo() + " 지불금액은 " + priceNo  + "원 입니다.");

		
	}

}
