package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// 문자 하나 입력
		// 유니코드 값 출력
		
		// 입력
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 출력 
		System.out.println(ch + " Unicode : " + (int)ch);
		
	}
	
	public void method2() {
		
		// 실수형 국, 영, 수 점수 입력
		// 정수형 총점, 평균 출력
		
		// 입력
		System.out.println("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.println("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.println("수학 : ");
		double math = sc.nextDouble();
		
		// 연산
		int sum = (int) (kor + eng + math); // 연산 후 결과값 형변환
		int avg = (int) (sum / 3);
		
		// 출력
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
	public void method3() {
		
		// 선언 및 초기화 된 변수 5개 
		// 사칙연산, 형변환 이용해 주석 값 출력
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch ='A';
		
		// 출력 
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		
		System.out.println((double)iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5
		
		System.out.println((int)fNum); // 3
		System.out.println(iNum1 / (int)fNum); // 3
		
		System.out.println(iNum1 / fNum); // 3.3333333
		System.out.println(iNum1 / (double)fNum); // 3.3333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch + iNum1); // 75
		System.out.println((char)(ch + iNum1)); // 'K'
		
	}

}
