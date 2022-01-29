package com.hw2.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		super.draw(); // 좌표값
		System.out.println("면적 : " + String.format("%.1f", Math.PI * radius * radius)); 
		System.out.println("둘레 : " + String.format("%.1f", Math.PI * radius * 2)); 
		
		// String.format("형식", 값) 을 통해 소수점 1번째 자리까지 반올림하여 출력
		
	}

}
