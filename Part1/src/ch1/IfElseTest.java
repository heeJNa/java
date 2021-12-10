package ch1;

//import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		/*
		int age = 7;

		//Scanner scanner = new Scanner(System.in);
		//int age = scanner.nextInt();
		
		if( age >= 8) {
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		 */
		
		int age = 12;
	   	int charge;
	   	
	   	if(age < 8){
	   		charge = 1000; 
	   		System.out.println("미 취학 아동입니다.");
	   	}
	   	else if(age < 14){
	   		charge = 2000;
	   		System.out.println("초등학생 입니다.");
	   	}
	   	else if(age < 20){
	   		charge = 2500;
	   		System.out.println("중, 고등학생 입니다.");
	   	}
	   	else{	//default조건
	   		charge = 3000;
	   		System.out.println("일반인 입니다.");
	   	} 
	   	
	   	System.out.println("입장료는 " + charge + "원입니다.");

	}

}
