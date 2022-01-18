package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		// 이름, 성별, 나이, 키 입력
		// 출력 
		
		// 입력 
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별을 입력하세요 (남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요 (cm): ");
		double height = sc.nextDouble();
		
		// 출력 
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다 ^^");
		
	}
	
	public void method2() {
		
		// 정수 2개 입력 
		// 합, 차, 곱, 나누기 몫 출력 
		
		// 입력 
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int numA = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int numB = sc.nextInt();
		
		// 연산 
		int sum = numA + numB;
		int minus = numA - numB;
		int mul = numA * numB;
		int div = numA / numB;
		
		// 출력 
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 몫 결과 : " + div);
		
	}
	
	public void method3() {
		
		// 가로, 세로 실수형으로 입력 
		// 사각형 면적, 둘레 출력 
		
		// 입력
		System.out.println("가로 : ");
		double width = sc.nextDouble();
		
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		
		// 연산 
		double area = width * height;
		double circum = (width + height) * 2;
		
		// 출력 
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + circum);
		
	}
	
	public void method4() {
		
		// 영어 문자열 값 입력 
		// 앞 문자 세개 출력 
		
		// 입력 
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		// 출력 
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}

}
