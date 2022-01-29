package com.hw1.model.vo;

public class Person {
	
	protected String name; // 같은 패키지 내, 다른 패키지의 자손 클래스 사용 가능 
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String information() {
		return name + ", " + age + ", " + height + ", " + weight;
	}

}
