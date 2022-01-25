package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {

	private Scanner sc = new Scanner(System.in);
	
	
	public EmpMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() { 

		Employee emp = null;

		while(true) {

			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine(); 
			
			switch(num) {
			// Employee emp = inputEmployee; 이런 식의 구문은 잘 보지 못해서 모르겠다 ㅠㅠ --------------------*
			case 1 : emp = inputEmployee(); break; //
			case 2 : modifyEmployee(emp); break; // emp 를 매개변수로 하는 modifyEmployee 메서드 호출
			case 3 : emp = null; break; // 가비지 컬렉터가 지워주게끔 ***
			case 4 : System.out.println(emp.information()); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("다시 입력해주세요."); break;
			}

		}

	}

	private Employee inputEmployee() { // 입력 
		
		System.out.println("사원명 : ");
		String empName = sc.nextLine();
		
		System.out.println("부서명 : ");
		String dept = sc.nextLine();
		
		System.out.println("직급 : ");
		String job = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		
		System.out.println("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("주소 : ");
		String address = sc.nextLine();
		
		// 매개변수 생성자를 이용하여 입력받은 값으로 newEmp 객체 생성
		// emp 로 생성해주지 않은 이유가 뭘까? --------------*
		Employee newEmp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address); 
		
		// 생성된 객체의 주소 값 반환 *** --> 주소값을 호출하는 곳은 어디인가..? --------------*
		return newEmp;
		
	}
	
	private void modifyEmployee(Employee emp) { // 수정 
		
		System.out.println("===== 사원 정보 수정 메뉴 =====");
		System.out.println("1. 이름 변경");
		System.out.println("2. 급여 변경");
		System.out.println("3. 부서 변경");
		System.out.println("4. 직급 변경");
		System.out.println("9. 이전 메뉴로");
		
		System.out.println("메뉴 번호 선택");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 :
			System.out.println("변경할 이름 : ");
			String newName = sc.nextLine();
			emp.setEmpName(newName); // 참조변수 emp 로 Employee class 를 참조
			break;
		case 2 :
			System.out.println("변경할 급여 : ");
			int newSalary = sc.nextInt();
			emp.setSalary(newSalary);
			break;
		case 3 :
			System.out.println("변경할 부서 : ");
			String newDept = sc.nextLine();
			emp.setDept(newDept);
			break;
		case 4 :
			System.out.println("변경할 직급 : ");
			String newJob = sc.nextLine();
			emp.setJob(newJob);
			break;
		case 9 :
			return;
		default :
			System.out.println("다시 입력해주세요.");
			break;
		}
		
	}

}
