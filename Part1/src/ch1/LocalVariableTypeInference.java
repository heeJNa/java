package ch1;

public class LocalVariableTypeInference {

	public static void main(String[] args) {

		var i = 10;		//변수를 알아서 추론해줌
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;  불가능
	}

}
