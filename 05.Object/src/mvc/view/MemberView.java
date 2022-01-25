package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberView() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		
		System.out.println("아이디 입력하시오 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 입력하시오 : ");
		String pwd = sc.nextLine();
		
		int result = mc.login(id, pwd); // 입력 받은 값을 login 메서드에 전달하고 결과값을 result 로 받아줌
		
		while(true) {
			
			if(result == 1) { // 로그인성공시 
				
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				
				System.out.println("메뉴 번호 선택 : ");
				int menu = sc.nextInt();
				sc.nextLine(); 
				
				switch(menu) {
				case 1 : System.out.println(mc.readInfo().information()); break; // 리턴받은 주소값을 information 형식대로 출력한다. 
				case 2 : System.out.println(mc.readAge()); break; 
				case 3 : updateHeight(); break;
				case 9 : System.out.println("프로그램을 종료합니다"); return;
				default : System.out.println("다시 입력해주세요"); break;
				}
				
			} else if(result == 0) {
				return;
			}
			
		}
		
	}

	private void updateHeight() {
		
		System.out.println("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		
		mc.updateHeight(height); // 입력 받은 키 값을 updateHeight 메서드에 전달
		
	}

}
