package ch2_9;

public class Student {
	private int studentID;
	private String studentName;
	
	Subject korea;	//�����ڷ���
	Subject math;
	
	public Student(int id, String name) {
		this.studentID = id;
		this.studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName +  " �л��� ������ " + total + "�� �Դϴ�." );
	}
}
