package coffee_decorator;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	public void brewing() {
		super.brewing();
		System.out.println("우유를 추가합니다.");
	}
}
