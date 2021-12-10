package ch1;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10); //앞의 연산이 false이기 때문에 뒤에 연산을 하지 않음.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);	
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
