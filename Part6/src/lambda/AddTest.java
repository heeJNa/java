package lambda;

public class AddTest {

	public static void main(String[] args) {

		Add add = (x,y)->{return x+y;};	//add �Լ��� ����
		
		System.out.println(add.add(2, 3));
	}

}
