package coffee_decorator;

public abstract class Decorator extends Coffee{
	
	Coffee coffee;
	
	public Decorator(Coffee coffee) {	//coffee�� ��ӹ��� ���� �ٿ� �� �ִ�.
		
		this.coffee =coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}

}
