package ch2_array;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String name;
	ArrayList<Subject> arr = new ArrayList<>();
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		arr.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject subject : arr) {
			total += subject.getScore();
			System.out.println("�л�" + name +"�� " + subject.getSubjectName() + " ���� ������ " + subject.getScore() + "�� �Դϴ�.");
		}
		System.out.println("�л� " + name + "�� ������ " + total + " �Դϴ�.");
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

}
