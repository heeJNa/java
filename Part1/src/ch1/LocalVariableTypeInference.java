package ch1;

public class LocalVariableTypeInference {

	public static void main(String[] args) {

		var i = 10;		//������ �˾Ƽ� �߷�����
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;  �Ұ���
	}

}
