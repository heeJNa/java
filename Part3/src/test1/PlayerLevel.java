package test1;

public abstract class PlayerLevel {
	
	public abstract void run();
	
	public abstract void jump();
	
	public abstract void turn();
	
	public abstract void shoLevelMessage();
	
	final void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}

}
