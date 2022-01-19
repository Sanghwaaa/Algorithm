package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		// 키보드로 정수 하나 입력
		// 양수, 양수가 아니다 출력

		// 입력
		System.out.println("정수 : ");
		int num = sc.nextInt();

		// 출력
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");

	}

	public void method2() {

		// 키보드로 정수 하나 입력
		// 양수, 0, 음수 출력

		// 입력
		System.out.println("정수 : ");
		int num = sc.nextInt();

		// 출력
		System.out.println(num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다"));

	}

	public void method3() {

		// 키보드로 정수 하나 입력
		// 양수, 0, 음수 출력

		// 입력
		System.out.println("정수 : ");
		int num = sc.nextInt();

		// 출력
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");

	}

	public void method4() {

		// 인원수, 사탕개수 입력
		// 1인당 사탕 개수, 남는 사탕 개수 출력

		// 입력
		System.out.println("인원 수 : ");
		int person = sc.nextInt();

		System.out.println("사탕 개수 : ");
		int num = sc.nextInt();

		// 연산
		int personNum = num / person;
		int candyNum = num % person;

		// 출력
		System.out.println("1인당 사탕 개수 : " + personNum);
		System.out.println("남는 사탕 개수 : " + candyNum);

	}

	public void method5() {

		// 입력 받은 값 변수에 저장
		// 성별 뽑아내서 출력

		// 입력
		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("학년 (숫자만) : ");
		int grade = sc.nextInt();

		System.out.println("반 (숫자만) : ");
		int classNum = sc.nextInt();

		System.out.println("번호 (숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("성별 (m/f) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.println("성적 (소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();

		// 성별 뽑아내기
		String genderName = (gender == 'm') || (gender == 'M') ? "남학생" : "여학생";

		// 출력
		System.out.println(
				grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + genderName + "의 성적은 " + score + "이다.");

	}

	public void method6() {

		// 나이 입력
		// 어린이, 청소년, 성인 출력

		// 입력
		System.out.println("나이 : ");
		int age = sc.nextInt();

		// 연산
		String ageGroup = age < 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");

		// 출력
		System.out.println(ageGroup);

	}

	public void method7() {

		// 국, 영, 수 점수 입력
		// 합계, 평균, 합격 여부 출력

		// 입력
		System.out.println("국어 : ");
		int kor = sc.nextInt();

		System.out.println("영어 : ");
		int eng = sc.nextInt();

		System.out.println("수학 : ");
		int math = sc.nextInt();

		// 연산
		int sum = kor + eng + math;
		double avg = sum / 3;
		String pass = ((kor >= 40) && (eng >= 40) && (math >= 40)) && avg >= 60 ? "합격" : "불합격";

		// 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(pass);

	}

	public void method8() {

		// 주민번호로 여자, 남자 출력

		// 입력
		System.out.println("주민번호를 입력하세요 (- 포함) : ");
		String gender = sc.nextLine();

		// 연산
		String genderName = (gender.charAt(7) == '2') || (gender.charAt(7) == '4') ? "여자" : "남자";

		// 출력
		System.out.println(genderName);

	}

	public void method9() {

		// 정수 2개 num1, num2 변수에 각각 저장
		// 또 다른 정수를 입력받아 num1 이하 or num2 초과 -> true

		// 입력
		// 단, num1 은 num2 보다 작아야함
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();

		System.out.println("정수2 : ");
		int num2 = sc.nextInt();

		System.out.println("입력 : ");
		int num3 = sc.nextInt();

		// 연산
		boolean result = (num3 <= num1) || (num3 > num2) ? true : false;

		// 출력
		System.out.println(result);

	}

	public void method10() {

		// 3개의 수 입력
		// 모두 같으면 true, 아니면 false

		// 입력
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();

		System.out.println("입력2 : ");
		int num2 = sc.nextInt();

		System.out.println("입력3 : ");
		int num3 = sc.nextInt();

		// 연산
		boolean result = (num1 == num2) && (num2 == num3) ? true : false;

		// 출력
		System.out.println(result);

	}

	public void method11() { // 다른 사람 코드 궁금

		// 연봉 각각 입력
		// 인센 포함 연봉, 3000 이상 여부 출력

		// 입력
		System.out.println("A사원의 연봉 : ");
		int sal1 = sc.nextInt();
		
		System.out.println("B사원의 연봉 : ");
		int sal2 = sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		int sal3 = sc.nextInt();
		
		// 인센 포함 연봉 
		double insenSal1 = sal1 + (sal1 * 0.4);
		double insenSal2 = sal2;
//		double insenSal3 = sal3 + (sal3 * 0.15); //--> 왜 소수점 표현이 안되는 걸까..?
		double insenSal3 = sal3 * 1.15;
		
		// 3000 이상, 미만 변수에 담아주기 
		String s1 = "3000 이상";
		String s2 = "3000 미만";
		
		// 출력 
		System.out.println("A사원의 인센티브 포함 연봉 : " + insenSal1);
		System.out.println(insenSal1 >= 3000 ? s1 : s2); // 3000 이상, 미만 여부 
		
		System.out.println("B사원의 인센티브 포함 연봉 : " + insenSal2);
		System.out.println(insenSal1 >= 3000 ? s1 : s2);
		
		System.out.println("C사원의 인센티브 포함 연봉 : " + insenSal3);
		System.out.println(insenSal3 >= 3000 ? s1 : s2);
		
	}

}
