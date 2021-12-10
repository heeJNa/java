package ch2_9;

public class Student {
	private int studentID;
	private String studentName;
	
	Subject korea;	//참조자료형
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
		System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );
	}
}
