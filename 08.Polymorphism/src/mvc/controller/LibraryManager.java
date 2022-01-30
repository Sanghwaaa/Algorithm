package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	private Member mem = null; // null로 명시초기화
	private Book[] bList = new Book[5];

	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {

		// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		this.mem = mem; // 매개변수를 LibraryManager mem 으로 전달

	}

	public Member myInfo() {

		// 회원 레퍼런스(mem) 주소 값 리턴
		return mem;

	}

	public Book[] selectAll() {

		// 도서 목록 레퍼런스(bList) 주소 값 리턴
		return bList;
	}

	public Book[] searchBook(String keyword) {

		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
		Book[] searchList = new Book[5]; // 배열로 생성하는 이유는 제목에 해당하는 책의 모든 정보를 출력할 것이기 때문에
		int count = 0;

		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면  HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기  HINT : count 이용
		for (int i = 0; i < bList.length; i++) { // bList 배열 돌리면서
			if (bList[i].getTitle().contains(keyword)) { // bList 의 타이블이 keyword 포함하고 있다면
				searchList[count] = bList[i]; // bList[i] 를 searchBook[i] 에 담아준다
				count++; // 한 번 실행될때마다 인덱스 ++
			}
		}

		// 해당 검색결과의 도서목록 주소 값 리턴
		return searchList;

	}

	public int rentBook(int num) {

		int result = 0;
		int couponCount = 0;
		
		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화 --> 나이 제한으로 대여 불가하다는 의미
		
		// 전달 받은 index의 bList 객체가 실제 CookBook 객체를 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “true”일 경우
		// 회원의 couponCount 1 증가 처리 후
		// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰이 발급됐다는 의미
		
		if(bList[num] instanceof AniBook) { // 부모타입인 bList 가 Anibook 으로 형변환 가능할때 
			if(((AniBook)bList[num]).getAccessAge() > mem.getAge()) { // 내 나이보다 크다면 *** 괄호주의 
				result = 1; // 대여 불가 
			}
		} else if(bList[num] instanceof CookBook) {
			if(((CookBook)bList[num]).getCoupon() == true) {
				couponCount ++;
				result = 2; // 대여 가능, 쿠폰 발급
			}
		}
		
		// result 값 리턴
		return result;
	
	}

}
