package coffee_decorator;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.println("모카시럽을 추가합니다.");
	}

}
