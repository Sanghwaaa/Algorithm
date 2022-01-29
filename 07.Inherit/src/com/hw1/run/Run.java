package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] sArr = new Student[3];
		
		int stuCount = 0;
		
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		{
			sArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
			sArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
			sArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
			stuCount = 3; // 배열의 끝까지 값이 담기지 않았을 수도 있으므로 카운트 변수 필요
		}
		
		// 위의 학생 정보 모두 출력
		for(int i = 0; i < stuCount; i++) {
			System.out.println(sArr[i].information());
		}
		System.out.println();
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] eArr = new Employee[10];
		
		int empCount = 0; // emp 사원 정보 카운트
		
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		while(true) {
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			System.out.println("신장 : ");
			double height = sc.nextDouble();
			
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.println("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.println("부서 : ");
			String dept = sc.nextLine();
			
			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			// 한 명씩 추가 될 때마다 카운트함
			eArr[empCount] = new Employee(name, age, height, weight, salary, dept); // 배열에 입력받은 값 담아줌
			empCount ++; // 한 번 입력 받을 때마다 카운트 ++
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			// ‘n’일 경우 더 이상 그만 입력 받도록..
			System.out.println("계속 추가하시겠습니까? (y/n) : ");
			char add = sc.nextLine().charAt(0);
			
			if(add == 'y') {
				continue;
			} else if(add == 'n') {
				break;
			}
			
		}
		
		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i = 0; i < empCount; i++) {
			System.out.println(eArr[i].information());
		}

	}

}
