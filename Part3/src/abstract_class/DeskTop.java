package abstract_class;

public class DeskTop extends Computer{

	
	@Override
	void typing() {
		System.out.println("DeskTop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnoff");
	}

	@Override
	void display() {
		System.out.println("DeskTop display");
	}

}

