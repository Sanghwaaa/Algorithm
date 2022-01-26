package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10; // 최대회원수 = 10
	private int memberCount; // 현재 회원수
	private Member[] mem = new Member[SIZE]; // 회원 객체 배열

	{ // 초기화 블럭
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {

		return memberCount; // 현재회원수 리턴

	}

	public Member checkId(String userId) {

		Member m = null; // 전달받은 회원의 아이디와 일치하는 회원 객체를 보관할 변수

		for (int i = 0; i < memberCount; i++) {
			if (userId.equals(mem[i].getUserId())) { // 아이디가 일치할 때
				m = mem[i]; // 해당 회원 객체를 m 에 대입
			}
		}

		return m; // 일치하면 해당 회원 객체 리턴, 일치하지 않으면 null 리턴

	}

	public void insertMember(Member newMem) {

		mem[memberCount] = newMem; // mem 배열에 새로 추가
		memberCount++; // 추가 후 memberCount ++

	}

	public Member searchMember(int menu, String search) {

		Member searchMember = null; // 검색된 회원 정보를 담을 변수 초기화

		// 매개변수로 전달받은 search 문자열을 menu 번호에 따라
		// 1 인 경우 아이디로 검색 후 결과를 searchMember에 대입하고
		// 2 인 경우 이름으로 검색 후 결과를 searchMember에 대입하고
		// 3 인 경우 이메일로 검색 후 결과를 searchMember에 대입하고
		// searchMember 주소 값 리턴

		if (menu == 1) { // 입력받은 메뉴 숫자

			for (int i = 0; i < memberCount; i++) { // 일치하는 id 찾아 해당 회원정보 searchMember 에 대입
				if (search.equals(mem[i].getUserId())) {
					searchMember = mem[i];
				}
			}

		} else if (menu == 2) {

			for (int i = 0; i < memberCount; i++) { // 일치하는 이름 찾아 해당 회원정보 searchMember 에 대입
				if (search.equals(mem[i].getName())) {
					searchMember = mem[i];
				}
			}

		} else if (menu == 3) {

			for (int i = 0; i < memberCount; i++) { // 일치하는 email 찾아 해당 회원정보 searchMember 에 대입
				if (search.equals(mem[i].getEmail())) {
					searchMember = mem[i];
				}
			}

		}

		return searchMember; // 회원정보 담아준 searchMember 리턴

	}

	public void updateMember(Member m, int menu, String update) {

		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
		// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
		// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경

		if (menu == 1) { // 입력받은 메뉴 숫자
			m.setUserPwd(update);
		} else if (menu == 2) {
			m.setName(update);
		} else if (menu == 3) {
			m.setEmail(update);
		}

	}

	public void deleteMember(String userId) {

		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		// memberCount 1 감소

//		for (int i = 0; i < memberCount; i++) {
//			if (userId.equals(mem[i].getUserId())) {
//				mem[i] = null; // mem[i] 를 null 로 만들어줌
//			}
//		}
//
//		memberCount--;

		// 현재 회원수만큼 반복
		for (int i = 0; i < memberCount; i++) {

			// 해당 순차적으로 접근한 객체의 아이디와 전달된 삭제할 회원의 아이디와 비교
			if (mem[i].getUserId().equals(userId)) {// 일치하는 회원 찾았을 경우

				// 만약 해당 회원이 마지막 회원이였을 경우
				if (i == memberCount - 1) {
					mem[i] = null; // 해당 회원 삭제만하면 됨 (null로 대입)

				} else { // 만약 해당 회원이 마지막 회원이 아닌 중간에 있었던 회원이였을 경우 => 뒤에 있는 회원들을 한칸씩 앞으로 땡겨야 된다.

					// 뒤에 있었던 회원들을 한칸씩 앞으로 땡기는 작업
					for (int j = i; j < memberCount - 1; j++) {
						mem[j] = mem[j + 1];
					}
					mem[memberCount - 1] = null; // 그리고 마지막이였던 회원은 null로
				}

				memberCount--; // 삭제했으니깐 memberCount 1감소

				break; // 삭제 한 후 이 반복문 빠져나가야됨

			}

		}

	}

	public Member[] getMem() {

		return mem;

	}

	public Member[] sortIdAsc() {

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}

		return copy;
	}

	public Member[] sortIdDesc() {

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}

		return copy;
	}

	public Member[] sortAgeAsc() {

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}

		return copy;
	}

	public Member[] sortAgeDesc() {

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}

		return copy;
	}

	public Member[] sortGenderDesc() {

		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getGender() == 'M' && copy[j].getGender() == 'F') {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}

		return copy;
	}

}
