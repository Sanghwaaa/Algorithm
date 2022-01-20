package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		// 한개의 값 입력
		// 1 ~ 그 숫자까지 숫자 모두 출력
		// 단 입력한 수는 1보다 크거나 같다

		// 입력
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// 출력
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void method2() {

		// 1번 문제와 동일하나
		// 잘못 입력시 다시 사용자가 값을 입력

		while (true) { // 무한반복

			// 입력
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			// 출력
			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}

	}

	public void method3() {

		// 한개의 값 입력
		// 1~그 숫자까지 거꾸로 출력
		// 단 입력한 수는 1보다 크거나 같아야 함

		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void method4() {

		while (true) {

			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}

	}

	public void method5() { //

		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i < num) {
				System.out.print(i + " + "); // 식 출력 중 1 + 2 + ...
			} else if (i == num) {
				System.out.print(i + " = " + sum); // 식 출력 중 ... num = sum
			}
		}

	}

	public void method6() {

		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {

			if (num1 > num2) { // 첫번째숫자가 두번째숫자보다 클때
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else if (num1 < num2) { // 두번째숫자가 첫번째숫자보다 클때
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}

		} else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}

	}

	public void method7() {

		while (true) {

			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {

				if (num1 > num2) { // 첫번째숫자가 두번째숫자보다 클때
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
				} else if (num1 < num2) { // 두번째숫자가 첫번째숫자보다 클때
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				}
				break;

			} else {
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}

		}

	}

	public void method8() {

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		System.out.println("=====" + num + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", num, i, num * i);
		}

	}

	public void method9() {

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num >= 2 && num <= 9) {

			for (int i = num; i <= 9; i++) { // n단 ~ 9단

				System.out.println("====" + i + "단 =====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d%n", i, j, i * j);
				}

			}

		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}

	}

	public void method10() {

		while (true) {

			System.out.println("숫자 : ");
			int num = sc.nextInt();

			if (num >= 2 && num <= 9) {

				for (int i = num; i <= 9; i++) { // n단 ~ 9단

					System.out.println("====" + i + "단 =====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d%n", i, j, i * j);
					}

				}
				break;

			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}

		}

	}

	public void method11() {

		System.out.println("시작 숫자 : ");
		int startNum = sc.nextInt();

		System.out.println("공차 : ");
		int gap = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(startNum + " ");
			startNum += gap;
		}

	}

	public void method12() { // 다른 사람들 코드 어떻게 짰는지 궁금하다.

		while (true) {

			System.out.println("연산자(+,-,*,/,%) : ");
			String oper = sc.nextLine();

			// exit 일 때 아래 실행하지 않고 바로 종료
			if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			System.out.println("정수1 : ");
			int num1 = sc.nextInt();

			System.out.println("정수2 : ");
			int num2 = sc.nextInt();

			// 연산자 / 일 때 num2 가 0 이거나, 연산자 잘못 입력 시 연산 실행 X
			if (oper.charAt(0) == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;

				/*
				 * java.lang.ArithmeticException 예외적 산술 조건이 발생할 때 생기는 예외 아래에 나누기 연산자일 때 구문이 실행되기
				 * 때문이다. --> continue 사용으로 아래 구문 실행되지 않고 위로 올라가게 해줌
				 */

			} else if (!(oper.charAt(0) == '+' || oper.charAt(0) == '-' || oper.charAt(0) == '*'
					|| oper.charAt(0) == '/' || oper.charAt(0) == '%')) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}

			if (oper.charAt(0) == '+') {
				System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
			} else if (oper.charAt(0) == '-') {
				System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
			} else if (oper.charAt(0) == '*') {
				System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
			} else if (oper.charAt(0) == '/') {
				System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
			} else if (oper.charAt(0) == '%') {
				System.out.printf("%d % %d = %d%n", num1, num2, num1 % num2);
			}
			break;

		}

	}

	public void method15() {

		System.out.println("숫자 :");
		int num = sc.nextInt();

		int count = 0; 
		
		if(num >= 2) {
			
			for(int i = 2; i <= num - 1; i++) { // 2부터 num-1까지 (나누기 몫 1, num 뺀 값)
				if(num % i == 0) { 
					count++; // 카운트 ++ 
				}
			}
			
			if(count == 0) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	public void method16() {
		
		while(true) {
			
			System.out.println("숫자 :");
			int num = sc.nextInt();

			int count = 0; 
			
			if(num >= 2) {
				
				for(int i = 2; i <= num - 1; i++) { // 2부터 num-1까지 (나누기 몫 1, num 뺀 값)
					if(num % i == 0) { 
						count++; // 카운트 ++ 
					}
				}
				
				if(count == 0) {
					System.out.println("소수입니다.");
					break;
				} else {
					System.out.println("소수가 아닙니다.");
					break;
				}
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
	}

	public void method17() {

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		int count = 0; // 소수가 아닌 경우를 카운트
		int primeNum = 0; // 소수인 경우를 카운트
		
		if(num >= 2) {
			
			for(int i = 2; i <= num; i++) { // 2부터 사용자가 입력한 수까지 
				for(int j = 2; j <= i - 1; j++) { 
					if(i % j == 0) {
						count++;
					}
				}
				
				if(count == 0) {
					System.out.print(i + " ");
				}
				
				if(count > 0) {
					primeNum++;
				}
				
				count = 0;
			}
			System.out.println();
			System.out.println("2부터 " + num + "까지의 소수의 개수는 " + (num - primeNum - 1) + "개입니다.");
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void method18() {

		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if(i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count : " + count);

	}

	public void method19() {

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 1행부터 num행까지

			// 공백
			for (int j = num - i; j >= 1; j--) {
				System.out.print(" ");
			}

			// 별
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public void method20() {

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		// 증가
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 감소
		for (int i = 1; i <= num - 1; i++) {
			for (int j = num - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void method21() {

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			// 공백
			for (int j = num - i; j > 0; j--) { // num-1 부터 1까지 j-- 
				System.out.print(" ");
			}

			// 별
			for (int k = 1; k < i * 2; k++) { // 1부터 i*2 까지 ㅑ++
				System.out.print("*");
			}

			// 공백
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			
			System.out.println();

		}

	}
	
	public void method22() {
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i == 1 || i == num) { // 1행이거나 num 행일때만 
				for(int j = 1; j <= num; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else { // 아닐때 
				System.out.print("*");
				for(int k = 1; k <= num - 2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
		
	}

}
