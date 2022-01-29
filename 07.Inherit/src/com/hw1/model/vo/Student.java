package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade; // 학년
	private String major; // 전공
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight); // 조상클래스 생성자 호출
		super.name = name; // 조상클래스 멤버 참조
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String information() { // 부모 information 오버라이딩
		// TODO Auto-generated method stub
		return super.information() + ", " + grade + ", " + major;
	}

}
