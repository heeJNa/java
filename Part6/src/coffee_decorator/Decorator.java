package coffee_decorator;

public abstract class Decorator extends Coffee{
	
	Coffee coffee;
	
	public Decorator(Coffee coffee) {	//coffee를 상속받은 것은 다올 수 있다.
		
		this.coffee =coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}

}
