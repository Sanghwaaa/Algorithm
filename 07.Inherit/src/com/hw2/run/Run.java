package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		Circle[] cArr = new Circle[2];
		Rectangle[] rArr = new Rectangle[2];
		
		// 위의 사용 데이터를 참고하여 각각 초기화
		cArr[0] = new Circle(1, 2, 3);
		cArr[1] = new Circle(3, 3, 4);
		
		rArr[0] = new Rectangle(-1, -2, 5, 2);
		rArr[1] = new Rectangle(-2, 5, 2, 8);
		
		// 각 도형의 draw 메소드 실행 --> for each 이용
		System.out.println("===== circle =====");
		for(Circle c : cArr) {
//			System.out.println(c.draw()); --> draw 에 이미 sysout 포함
			c.draw();
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle r : rArr) {
			r.draw();
		}

	}

}
