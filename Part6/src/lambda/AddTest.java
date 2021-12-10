package lambda;

public class AddTest {

	public static void main(String[] args) {

		Add add = (x,y)->{return x+y;};	//add 함수를 구현
		
		System.out.println(add.add(2, 3));
	}

}
