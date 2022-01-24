package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		int[] arr = new int[10];
		int value = 1; // arr[i] 에 담아줄 값, 1부터 늘어나면서 담기기 때문에 시작값 1로 지정

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value++; // arr[i] 에 value 값 담은 후 후위연산자로 ++ 해준다.
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void method2() {

		int[] arr = new int[10];
		int value = 10; // arr[i] 에 담아줄 값, 10부터 줄어들면서 담기기 때문에 시작값 10으로 지정

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value--; // arr[i] 에 value 값 담은 후 후위연산자로 -- 해준다.
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void method3() {

		System.out.println("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num]; // 사용자한테 입력 받은 양의 정수만큼 배열 크기 할당
		int value = 1;

		// 1 ~ num 까지 배열에 초기화
		for (int i = 0; i < num; i++) {
			arr[i] = value++;
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void method4() {

		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" }; // 생성과 동시에 {} 로 초기화
		System.out.println(arr[1]);

	}

	public void method5() {

		System.out.println("문자열 : ");
		String str = sc.nextLine();

		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()]; // 입력받은 문자열의 크기만큼의 배열 생성

		// 문자열의 문자 하나하나를 배열에 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i); // i 값 = 인덱스 값 (arr[0]일 때 index 0, ...)
		}

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		int count = 0; // 인덱스 개수

		// 입력받은 문자와 일치하는 인덱스 값 찾기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) { // arr[i] 의 값이 입력받은 문자 값과 같을 때
				System.out.print(i + " "); // 인덱스 출력
				count++; // 카운트 ++
			}
		}

		System.out.println(); // 개행
		System.out.println(ch + " 개수 : " + count);

	}

	public void method6() {

		String[] arr = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) { // 0 ~ 6 사이의 숫자를 입력했을 때

			for (int i = 0; i < 7; i++) {
				if (i == num) { // 인덱스값과 입력받은 num 이 일치할 때,
					System.out.println(arr[i]);
				}
			}

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void method7() {

		System.out.println("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num]; // 입력 받은 값만큼 정수형 배열 크기 할당

		// 초기화
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt(); // 사용자에게 입력 받은 값으로 arr[i] 초기화
		}

		// 전체 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println(); // 개행

		// 전체 값 합계
		int sum = 0; // 배열 전체 값의 합을 담을 변수

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("총 합 : " + sum);

	}

	public void method8() {

		while (true) {

			System.out.println("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) { // num 이 3 이상이면서 홀수일 때

				int[] arr = new int[num]; // 입력 받은 값만큼 정수형 배열 크기 할당
				int value = 0;

				// 배열의 중간까지는 1부터 1씩 증가하는 오름차순 값 넣기
				for (int i = 0; i <= (int) (num / 2); i++) {
					arr[i] = ++value;
				}

				// 배열의 중간 이후부터는 1씩 감소하여 내림차순으로 값 넣기
				for (int i = (num / 2 + 1); i < arr.length; i++) {
					arr[i] = --value;
				}

				// 출력
				for (int i = 0; i < arr.length; i++) {
					if (i < num - 1) { // i 가 arr[num-1] 전일 때까지
						System.out.print(arr[i] + ", ");
					} else { // i 가 arr[num-1] 일 때, 즉 인덱스 끝값일 때
						System.out.print(arr[i]);
					}
				}
				break; // 가장 가까운 반복문을 빠져나간다.

			} else {
				System.out.println("다시 입력하세요.");
			}

		}

	}

	public void method9() { // --------------------- ? 

		String[] arr = { "황금올리브", "허니콤보", "고추바사삭" };

		System.out.println("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(menu)) {
				System.out.println(arr[i] + "치킨 배달 가능");
				break;
			} else if (!(arr[i].equals(menu))) {
				System.out.println(arr[i] + "치킨은 없는 메뉴입니다.");
				break;
			}
		}

	}

	public void method10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 1 ~ 10 사이 난수
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void method11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 1 ~ 10 사이 난수
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 오름차순으로 정렬한 후 첫 번째 인덱스와 마지막 인덱스가 각각 최소값과 최대값  
		int temp = 0; // 정렬할 때 임시로 값 담아줄 공간 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) { // 비교주체보다 비교대상이 더 크다면 
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(); // 개행
		System.out.println("최대값 : " + arr[9]); 
		System.out.println("최소값 : " + arr[0]);

	}
	
	public void method12() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 1 ~ 10 사이 난수
			
			// 중복제거 
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { // 담아준 값이 비교주체와 비교대상이 같다면 
					i--; // 다시 이전 인덱스로 돌아가 값을 담아주는 것을 반복 
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method13() {
		
		System.out.println("주민등록번호(-포함) : ");
		String registNum = sc.nextLine();
		
		char[] arr = new char[14];
		
		for(int i = 0; i < 8; i++) {
			arr[i] = registNum.charAt(i);
		}
		
		for(int i = 8; i < arr.length; i++) {
			arr[i] = '*';
		}
		
		// 출력 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public void method14() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1); // 로또번호 1 ~ 45 사이의 랜덤값 
			
			// 중복제거 
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		int temp = 0; // 정렬할 때 임시로 값 담아줄 공간 
		
		// 오름차순 정렬 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
