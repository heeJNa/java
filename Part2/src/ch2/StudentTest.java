package ch2;

class Student {
	
	public int studentID;
	public String studentName;  
	public String address;
			
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}


public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);	//studentLee는 참조변수
		System.out.println(studentKim);
		//패키지이름과 클래스 이름 +  
		//힙 메모리를 가리키는 주소값이 나옴.(가상 해쉬코드값(16진수))

	}

}
