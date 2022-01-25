package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	private Member mem = new Member("admin", "1234", "홍길동", "901022-45122334", 163.0); // 매개변수 생성자 이용하여 초기화

	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	
	public int login(String id, String pwd) {
		
		if(id.equals(mem.getMemberId()) && pwd.equals(mem.getMemberPwd())) {
			return 1; // id, pwd 모두 일치 시 1 리턴
		}
		
		return 0; // 아니면 0 리턴
		
	}

	public Member readInfo() { 
		
		return mem; // mem 주소값 리턴 
		
	}

	public int readAge() { 
		
		int age = 0;
		int year = Integer.parseInt(mem.getCitizenNo().substring(0, 2)); // 주민번호 앞 2자리를 int 타입으로 반환 
		
		if(year > 23) { // 22 보다 작으면 1900 년도 출생 
			age = 2022 - (1900 + year) + 1;
		} else { // 아니면 2000 년도 출생 
			age = 2022 - (2000 + year) + 1;
		}
		
		return age; // 나이 리턴 
		
	}

	public void updateHeight(double height) {
		
		mem.setHeight(height); // 전달 받은 height값으로 mem 의 height 값 수정
		
	}

}
