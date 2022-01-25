package com.hw6.run;

import com.hw6.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		
		StaticSample s = new StaticSample();
		
		s.setValue("Java");
		System.out.println("value : " + s.getValue());
		
		// 메서드를 실행한 후에 출력해야 변경된 값이 담김
		s.toUpper(); // 메서드 실행 
		System.out.println(s.getValue()); // 출력 
		
		System.out.println("길이 : " + s.valueLength());
		
		System.out.println("PROGRAMMING 붙여서 : " + s.valueConcat("PROGRAMMING"));
		
		s.setChar(0, 'C');
		System.out.println("J -> C : " + s.getValue());

	}

}
