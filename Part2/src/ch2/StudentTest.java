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
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);	//studentLee�� ��������
		System.out.println(studentKim);
		//��Ű���̸��� Ŭ���� �̸� +  
		//�� �޸𸮸� ����Ű�� �ּҰ��� ����.(���� �ؽ��ڵ尪(16����))

	}

}
