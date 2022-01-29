package com.hw1.model.vo;

public class Employee extends Person {

	private int salary; // 급여 
	private String dept; // 부서 
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);  // 조상클래스 생성자 호출
		super.name = name; // 조상클래스 멤버 참조
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String information() { // 부모 information 오버라이딩
		return super.information() + ", " + salary + ", " + dept;
	}
	
}