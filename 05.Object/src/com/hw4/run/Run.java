package com.hw4.run;

import com.hw4.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample n = new NonStaticSample();
		n.printLottoNumbers();
		n.outputChar(5, 'a'); // 매개변수 전달 
		System.out.println("랜덤 영문자 출력 : " + n.alphabette());
		System.out.println("apple 의 2번 4번 인덱스 사이의 값 출력 : " + n.mySubstring("apple", 2, 4)); // 매개변수 전달

	}

}
