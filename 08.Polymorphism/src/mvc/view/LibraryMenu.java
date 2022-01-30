package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {

	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);

//	회원이 만화책 또는 요리책을 빌리려고 한다. 
//	먼저 프로그램이 실행되면 회원의 인적 사항을 입력하고 회원등록을 해준다. 
//	그 다음에 메뉴가 출력되면서 마이페이지, 도서전체조회, 도서검색, 도서대여 기능을 할 수 있다. 
//	도서를 대여할 때 해당 도서가 만화책일 경우 나이제한이 있기 때문에 
//	회원 나이와 만화책의 제한 나이를 비교해야 되고, 
//	대여할 도서가 요리책일 경우 해당 도서에 요리학원 쿠폰이 있으면 쿠폰이 해당 멤버 객체에게 발급된다.

	public void mainMenu() {

		// 회원등록
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);

		// LibraryManager의 insertMember() 메소드에 전달
		Member mem = new Member(name, age, gender); // 멤버타입의 mem 에 매개변수 생성자를 이용해 담아주고
		lm.insertMember(mem); // lm.insertMember 메서드에 매개변수 mem 을 전달

		// 메인메뉴 실행
		while (true) {

			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				Member memInfo = lm.myInfo(); // myInfo 호출한 값(내 정보)를 meminfo 에 담아줌
				System.out.println(memInfo);
				break;
			case 2:
				selectAll(); // 도서 전체 조회 메서드 호출
				break; 
			case 3:
				searchBook(); // 도서 검색
				break; 
			case 4:
				rentBook(); // 도서 대여
				break;
			case 0: System.out.println("프로그램이 종료됩니다."); return;
			default: System.out.println("다시 입력해주세요"); break;
			}

		}

	}

	// 출력화면은 Menu 에 구현, 조회하는 기능은 controller 에 구현하기

	private void selectAll() {

		// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
		Book[] bList = lm.selectAll();

		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력, 대여할 때 도서번호를 알기 위해
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]);
		}

	}

	private void searchBook() {

		System.out.println("검색할 제목 키워드 : ");
		String title = sc.next(); // *** 키워드라서 공백 없이 받는 건가?

		// LibraryManager의 searchBook() 메소드에 전달
		// 그 결과 값을 Book[] 자료형으로 받기
		Book[] searchList = lm.searchBook(title);

		// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
		// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
		// --> null 도 같이 출력되는 이유는 for each 문으로 처음부터 끝까지 출력해서 
		// null 이 아닐 때만 출력해준다 
		int count = 0;
		
		for(Book bk : searchList) {
			if(bk != null) {
				System.out.println(bk);
				count ++; // 존재할 경우 1 증가 
			} 
		}
		
		if(count == 0) { // 위에 for문을 다 돌아도 존재하지않는다면 (= 카운트가 증가하지않았다)
			System.out.println("검색 결과가 없습니다.");
		}

	}

	private void rentBook() {
		
		// 도서 대여를 위해 도서번호를 알아야 된다.
		// 도서 리스트 출력 
		selectAll();

		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int result = lm.rentBook(num); // 메서드 실행 결과를 result 로 받아준다.

		// 0일 경우  “성공적으로 대여되었습니다.” 출력
		// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요” 출력
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
		
	}

}
