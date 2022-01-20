package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		// 메뉴 출력
		// 메뉴를 선택하면 ㅇㅇ 메뉴, 종료 선택하면 종료 출력

		// 메뉴 출력
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");

		// 메뉴 선택
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다");
			break;
		default:
			System.out.println("잘못 입력하였습니다");
			break;
		}

	}
	
	public void method2() {
		
		// 정수 입력 
		// 양수이면서 짝수 -> 짝수, 짝수가 아니면 -> 홀수, 양수가 아니면 -> 양수만 입력
		
		// 입력 
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		// 출력 
		if(num > 0) { // 양수일때 
			if(num % 2 == 0) { 
				System.out.println("짝수");  
			} else if(num % 2 == 1) { 
				System.out.println("홀수");
			}
		} else if(num < 0) {// 양수가 아닐때 
			System.out.println("양수만 입력해주세요");
		}
		
		/*&& 연산자를 사용해서 조건을 줄 수 도 있었지만
		 * 그렇게 되면 num > 0 식을 두 번 써야 하므로 
		 * num > 0 일 때, 짝수, 음수를 판별하는 조건을 넣어 코드 길이를 줄여보았따*/
		
	}
	
	public void method3() {
		
		// 국, 영, 수 점수 입력 
		// 합격일 때 -> 합계, 평균, 합/불 여부 출력 
		// 불합격일 때 -> 합/불 여부 출력 
		
		// 점수 입력 
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		// 합계, 평균
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		// 합/불 여부 출력 
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void method4() {
		
		// switch 문으로 월 입력받아 계절 출력 
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3 :
		case 4 :
		case 5 :	
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month + "월은 겨울입니다.");
			break;
		default : 
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;
		}
		
	}
	
	public void method5() {
		
		// 아이디, 비밀번호 정해놓고 로그인 기능 작성 
		
		// 아이디, 비밀번호 
		String id = "user1";
		String pwd = "1234";
		
		// 입력
		System.out.println("아이디 : ");
		String inputId = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String inputPwd = sc.nextLine();
		
		// 로그인 기능 
		if(inputId.equals(id) && inputPwd.equals(pwd)) {
			System.out.println("로그인 성공");
		}
		
		if(!(inputId.equals(id)) && inputPwd.equals(pwd)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		if(inputId.equals(id) && !(inputPwd.equals(pwd))) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	
	public void method6() {
		
		// 관리자, 회원, 비회원 중 하나 입력 받아 각 등급이 행할 수 있는 권한 출력 
		
		// 입력 
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		// 출력 
		switch(grade) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
		
	}
	
	public void method7() {
		
		// 키, 몸무게 입력
		// BMI 지수 계산, 체중 여부 출력 

		// 입력 
		System.out.println("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		// BMI 지수 
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		// 체중 여부 출력 
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else if(bmi >= 30) {
			System.out.println("고도 비만");
		}
		
	}
	
	public void method8() {
		
		// 두개의 양수, 연산기호 입력받아 결과 출력 
		// 양수가 아니거나 제시된 연산기호 아닐 때 잘못입력 출력 
		
		// 입력 
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자 입력(+,-,*,/,%) : ");
		char oper = sc.nextLine().charAt(0);
		
		// 연산 
		int cal = 0;
		
		if(oper == '+') {
			cal = num1 + num2;
		} else if(oper == '-') {
			cal = num1 - num2;
		} else if(oper == '*') {
			cal = num1 * num2;
		} else if(oper == '/') {
			cal = num1 / num2;
		} else if(oper == '%') {
			cal = num1 % num2;
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		// 출력 
		System.out.printf("%d %c %d = %d", num1, oper, num2, cal);
		
	}
	
	public void method9() {
		
		// 중간(20%), 기말(30%), 과제(30%), 출석횟수(20%) 입력
		// pass/fail 여부 출력 
		
		// 입력 
		System.out.println("중간고사 점수 : ");
		int exam1 = sc.nextInt();
		
		System.out.println("기말고사 점수 : ");
		int exam2 = sc.nextInt();
		
		System.out.println("과제 점수 : ");
		int task = sc.nextInt();
		
		System.out.println("출석 회수 : ");
		int attend = sc.nextInt();
		
		// 연산 
		double ex1 = exam1 * 0.2;
		double ex2 = exam2 * 0.3;
		double tk= task * 0.3;
		double att = attend;
		double sum = ex1 + ex2 + tk + attend;
		
		// 출력 
		System.out.println("===== 결과 =====");
		
		if(sum >= 70 && att >= 20 * 0.7) { // PASS
			
			System.out.println("중간 고사 점수(20) : " + ex1);
			System.out.println("기말 고사 점수(30) : " + ex2);
			System.out.println("과제 점수(30) : " + tk);
			System.out.println("출석 점수(20) : " + att);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
			
		} else { // FAIL
			
			if(sum < 70) { // 점수 미달 
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			} 
			
			if(att < 20 * 0.7) { // 출석 횟수 부족 
				System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
			}
		}

	}
	
	public void method10() {
		
		// 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면 구현 
		
		// 메뉴 
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		// 입력 
		System.out.println("선택 : ");
		int menu = sc.nextInt();
		
		// 선택 메뉴 실행 
		switch(menu) {
		case 1 : 
			method1();
			break;
		case 2 : 
			method2();
			break;
		case 3 : 
			method3();
			break;
		case 4 : 
			method4();
			break;
		case 5 : 
			method5();
			break;
		case 6 : 
			method6();
			break;
		case 7 : 
			method7();
			break;
		case 8 : 
			method8();
			break;
		case 9 : 
			method9();
			break;
		default : 
			System.out.println("잘못 선택하셨습니다.");
			break;
		}
		
	}

}
