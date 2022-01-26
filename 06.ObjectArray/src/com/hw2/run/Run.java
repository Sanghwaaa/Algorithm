package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] sArr = new Student[10];

		int count = 0; // 학생 수를 나타내는 변수, 한 명 추가 시 1씩 증가

		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
		// 한 명씩 추가 되었기 때문에 count 1증가
		// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
		while (true) {

			System.out.println("학년 : ");
			int grade = sc.nextInt();

			System.out.println("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();

			System.out.println("이름 : ");
			String name = sc.nextLine();

			System.out.println("국어점수 : ");
			int kor = sc.nextInt();

			System.out.println("영어점수 : ");
			int eng = sc.nextInt();

			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();

			sArr[count++] = new Student(grade, classroom, name, kor, eng, math); // 배열의 count 인덱스에 입력받은 값 담아줌

			System.out.println("계속 추가하시겠습니까? (y/n) : ");
			char add = sc.nextLine().charAt(0);

			if (add == 'y' || add == 'Y') {
				continue; // y 일 때 아래 구문을 실행시키지 않고 가장 가까운 반복문으로 이동 
			} else if (add == 'n' || add == 'N') {
				break; // n 일 때 해당 메서드를 호출한 곳으로 빠져나감 
			}
			
			// java.lang.StringIndexOutOfBoundsException: String index out of range: 0
			// --> 배열의 크기보다 크거나 음수 인덱스 : substring 함수 사용 시 string의 길이를 벗어나서인 경우가 많다
			// ㅎㅎ.. 개행 문제였다! sc.nextLine(); 넣어주니 해결됐다.

		}

		// 현재 배열에 담겨있는
		// 학생들의 정보를 모두 출력
		for (int i = 0; i < count; i++) {
			System.out.println(sArr[i].information());
		}
		
		// Unreachable code
		// --> 무한루프에 break문이 없다면 이 루프는 무한하게 돌고 아래 코드에 도달할 수 없다.
		// 위에 while 문에 걸어준 분기문의 문제같은데... 아마 오탈자가 있었나보다. 딱히 수정한 게 없는데 해결됨.
	}

}
