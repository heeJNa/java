package ch1;

//import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		/*
		int age = 7;

		//Scanner scanner = new Scanner(System.in);
		//int age = scanner.nextInt();
		
		if( age >= 8) {
			System.out.println("�б��� �ٴմϴ�");
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		 */
		
		int age = 12;
	   	int charge;
	   	
	   	if(age < 8){
	   		charge = 1000; 
	   		System.out.println("�� ���� �Ƶ��Դϴ�.");
	   	}
	   	else if(age < 14){
	   		charge = 2000;
	   		System.out.println("�ʵ��л� �Դϴ�.");
	   	}
	   	else if(age < 20){
	   		charge = 2500;
	   		System.out.println("��, ����л� �Դϴ�.");
	   	}
	   	else{	//default����
	   		charge = 3000;
	   		System.out.println("�Ϲ��� �Դϴ�.");
	   	} 
	   	
	   	System.out.println("������ " + charge + "���Դϴ�.");

	}

}
