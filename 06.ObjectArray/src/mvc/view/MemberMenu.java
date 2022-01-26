package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {

			System.out.println("=== 회원 관리 메뉴 ===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");

			System.out.println("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}

		}

	}

	private void insertMember() {

		// 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
		// MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
		// 최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능

		int memberCount = mc.getMemberCount(); // 현재 회원 수 조회

		if (memberCount >= MemberController.SIZE) { // 현재 회원 수가 최대 회원 수 이상일 때
			System.out.println("회원 수를 초과했습니다.");
			return; // 더 이상 추가할 수 없기 때문에 해당 메서드를 빠져나간다.
		}

		// 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값 받기
		// (아이디 중복 체크)

		System.out.println("아이디 : ");
		String userId = sc.nextLine();

		// 아이디 중복체크
		Member result = mc.checkId(userId); // 입력받은 아이디를 mc.chechId 메서드에 보내주고 결과값을 result 로 받는다.

		// 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
		// “동일한 아이디가 존재합니다. 회원등록 실패” 출력

		// 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
		// 나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
		// 입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
		// MemberController의 insertMember() 메소드로 전달
		// “성공적으로 회원 등록이 되었습니다.” 출력

		if (result != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패.");
		} else {

			System.out.println("비밀번호 : ");
			String userPwd = sc.nextLine();

			System.out.println("이름 : ");
			String name = sc.nextLine();

			System.out.println("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("성별 : ");
			char gender = sc.nextLine().charAt(0);

			System.out.println("이메일 : ");
			String email = sc.nextLine();

			Member newMem = new Member(userId, userPwd, name, age, gender, email); // 매개변수 생성자를 이용해 담아줌
			mc.insertMember(newMem); // insertMember 메서드에 입력 받은 객체 보내줌

			System.out.println("성공적으로 회원 등록이 되었습니다.");

		}

	}

	private void searchMember() {

		while (true) {

			System.out.println("=== 회원 정보 검색 ===");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");

			System.out.println("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			System.out.println("검색 내용 : ");
			String search = sc.nextLine();

//			// 9번 선택했을 경우 => 이전메뉴로 => 즉, 이 메소드 자체를 빠져나가게
//			if (menu == 9) {
//				System.out.println("이전메뉴로 돌아갑니다.");
//				return;
//			}
//
//			System.out.print("\n검색 내용 : ");
//			String search = sc.nextLine();
//
//			// ** 회원 정보 검색 요청 (Controller에 요청함)
//			Member searchMember = mc.searchMember(menu, search); // 예를들어, (2, "강보람")를 전달시 이름으로 "강보람"을 검색하겠다는 의미

			Member result = null;

			switch (menu) {
			case 1:
			case 2:
			case 3:
				result = mc.searchMember(menu, search);
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}

			if (result == null) {
				System.out.println("검색된 결과가 없습니다.");
			} else {
				System.out.println(result.information());
			}

		}

	}

	private void updateMember() {

		while (true) {

			System.out.println("=== 회원 정보 수정 ===");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");

			System.out.println("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			System.out.println("변경할 회원 아이디 : ");
			String userId = sc.nextLine();

			// 1. MemberController의 checkId()로 userId 전달 >> 결과 값 (m : Member)
			Member m = mc.checkId(userId);

			// 1_2. 결과 값이 null인경우 >> “변경할 회원이 존재하지 않습니다” 출력
			// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
			// 변경내용(update : String) 입력 받고
			// MemberController의 updateMember()에 m, menu, update 전달
			// “회원의 정보가 변경되었습니다.” 출력
			if (m != null) {

				System.out.println(m.information()); // 기존정보 출력

				System.out.println("변경할 내용 : ");
				String update = sc.nextLine();

				mc.updateMember(m, menu, update);

				System.out.println("회원 정보가 변경되었습니다.");

			} else {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			}

		}

	}

	private void deleteMember() {

		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();

		// 1. MemberController의 checkId()에 userId 전달 >> 결과 값 (m : Member)
		Member m = mc.checkId(userId);

		// 1_1. 결과 값이 null인 경우 “삭제할 회원이 존재하지 않습니다.” 출력
		// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력
		// “정말 삭제하시겠습니까? (y/n) : “ >> 키보드로 입력 받기
		// 대소문자 구분 없이 ‘Y’인 경우 MemberController의 deleteMember()에 userId 전달
		// “회원의 정보가 삭제되었습니다.” 출력
		if (m != null) {

			System.out.println(m.information()); // 기존정보 출력

			System.out.println("정말 삭제하시겠습니까? (y/n)");
			String delete = sc.nextLine();

			if (delete.equalsIgnoreCase("y")) { // 대소문자 모두 포함
				mc.deleteMember(userId);
				System.out.println("회원 정보가 삭제되었습니다.");
			}

		} else {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}

	}

	private void printAllMember() {

		Member[] mem = mc.getMem();

		for (int i = 0; i < mem.length; i++) {
			System.out.println(mem[i].information());
		}

	}

	private void sortMember() {

		System.out.println("=== 회원 정보 정렬 ===");
		System.out.println("1. 아이디 오름차순 정렬");
		System.out.println("2. 아이디 내림차순 정렬");
		System.out.println("3. 나이 오름차순 정렬");
		System.out.println("4. 나이 내림차순 정렬");
		System.out.println("5. 성별 내림차순 정렬(남여순)");
		System.out.println("9. 이전 메뉴로");

		System.out.println("메뉴 번호 선택 : ");
		int menu = sc.nextInt();

		if (menu == 9) {
			System.out.println("이전메뉴로 돌아갑니다.");
			return;
		}

		Member[] sortMem = null;

		switch (menu) {
		case 1:
			sortMem = mc.sortIdAsc();
			break;
		case 2:
			sortMem = mc.sortIdDesc();
			break;
		case 3:
			sortMem = mc.sortAgeAsc();
			break;
		case 4:
			sortMem = mc.sortAgeDesc();
			break;
		case 5:
			sortMem = mc.sortGenderDesc();
			break;
		case 9:
			return;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}

		System.out.println("====== 정렬결과 ======");
		for (int i = 0; i < sortMem.length; i++) {
			System.out.println(sortMem[i].information());
		}

	}

}
