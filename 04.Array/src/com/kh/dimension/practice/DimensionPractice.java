package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	
	Scanner sc = new Scanner(System.in);

	public void method1() {

		int[][] arr = new int[4][4];

		int value = 0; // 배열에 담길 값

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++value;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println(); // 1행 끝날때마다 개행
		}

	}

	public void method2() {

		int[][] arr = new int[4][4];

		int value = 16; // 배열에 담길 값

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println(); // 1행 끝날때마다 개행
		}

	}
	
	public void method3() {
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println(); // 개행
		}
		
	}
	
	public void method4() { // ---------------------------- ?
		
		int[][] arr = new int[4][4];
		int sum = 0; // 열의 합을 담아줄 변수 
		int sum2 = 0; // 행의 합을 담아줄 변수  
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i < arr.length - 1) {
				
				for(int j = 0; i < arr[i].length; j++) {
					
					if(j < arr.length - 1) {
						arr[i][j] = (int) (Math.random() * 10 + 1); // 1~10 사이 랜덤값 담아줌 
						sum += arr[i][j]; // sum 에 합을 담아줌 
					} else if(j == arr.length - 1) {
						arr[i][j] = sum; // 합을 담아준다 
						sum = 0; // 다시 0으로 초기화
					}
					
				}
				
			} else if(i == arr.length - 1) {
				
				for(int j = 0; j < arr.length - 1; j++) {
					sum2 += arr[i][j];
				}
				
			}
	
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		
		while(true) {
			
			System.out.println("행 크기 : ");
			int row = sc.nextInt(); // 행 
			
			System.out.println("열 크기 : ");
			int column = sc.nextInt(); // 열
			
			if(row > 0 && row < 11 && column > 0 && column < 11) { // 입력받은 수가 1~10 사이일 때 
				
				char[][] arr = new char[row][column]; // 입력받은 값만큼 배열의 크기 할당 
				
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) (Math.random() * 26 + 65); // A~Z, 즉 65~90 사이 값을 (char) 타입으로 형변환해서 담아줌
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						System.out.printf("%2s", arr[i][j]);
					}
					System.out.println(); // 개행
				}
				
				break;
				
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
			
		}
		
	}
	
	public void method6() {
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원","열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " "); // i <-> j 인덱스 값을 바꿔줌으로써 출력 순서의 기준을 열로 변경 
			}
			System.out.println();
		}
		
	}
	
	public void method7() {
		
		System.out.println("행의 크기 : ");
		int row = sc.nextInt(); // 전체 행의 크기 
		
		char[][] arr = new char[row][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "행의 크기 : ");
			int column = sc.nextInt();
			
			arr[i] = new char[column]; // 입력한 값만큼 i 행의 크기 생성 
		}
		
		char value = 'a'; // 담을 값 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2c", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method8() {
		
		String[] arr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];
		
		int value = 0;
		
		for(int i = 0; i < strArr1.length; i++) { // 값 정해주는 대신 할 방법 없나?
			for(int j = 0; j < strArr1[i].length; j++) { 
				strArr1[i][j] = arr[value++];
			}
		}
		
		value = 6;
		
		for(int i = 0; i < strArr2.length; i++) { 
			for(int j = 0; j < strArr2[i].length; j++) { 
				strArr2[i][j] = arr[value++];
			}
		}
		
		System.out.println("=== 1분단 ===");
		for(int i = 0; i < strArr1.length; i++) { 
			for(int j = 0; j < strArr1[i].length; j++) { 
				System.out.printf("%-5s", strArr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=== 2분단 ===");
		for(int i = 0; i < strArr2.length; i++) { 
			for(int j = 0; j < strArr2[i].length; j++) { 
				System.out.printf("%-5s", strArr2[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method9() {
		
String[] arr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] strArr1 = new String[3][2];
		String[][] strArr2 = new String[3][2];
		
		int value = 0;
		
		for(int i = 0; i < strArr1.length; i++) { // 값 정해주는 대신 할 방법 없나?
			for(int j = 0; j < strArr1[i].length; j++) { 
				strArr1[i][j] = arr[value++];
			}
		}
		
		value = 6;
		
		for(int i = 0; i < strArr2.length; i++) { 
			for(int j = 0; j < strArr2[i].length; j++) { 
				strArr2[i][j] = arr[value++];
			}
		}
		
		System.out.println("=== 1분단 ===");
		for(int i = 0; i < strArr1.length; i++) { 
			for(int j = 0; j < strArr1[i].length; j++) { 
				System.out.printf("%-5s", strArr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=== 2분단 ===");
		for(int i = 0; i < strArr2.length; i++) { 
			for(int j = 0; j < strArr2[i].length; j++) { 
				System.out.printf("%-5s", strArr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("======================");
		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for(int i = 0; i < strArr1.length; i++) { 
			for(int j = 0; j < strArr1[i].length; j++) { 
				if(name.equals(strArr1[i][j])) {
					if(j == 0) {
						System.out.println("검색하신 " + name + " 학생은 1분단 " + (i+1) + "번째 줄 왼쪽에 있습니다.");
					} else if(j == 1) {
						System.out.println("검색하신 " + name + " 학생은 1분단 " + (i+1) + "번째 줄 오른쪽에 있습니다.");
					}
					
				}
			}
		}
		
		for(int i = 0; i < strArr2.length; i++) { 
			for(int j = 0; j < strArr2[i].length; j++) { 
				if(name.equals(strArr2[i][j])) {
					if(j == 0) {
						System.out.println("검색하신 " + name + " 학생은 2분단 " + (i+1) + "번째 줄 왼쪽에 있습니다.");
					} else if(j == 1) {
						System.out.println("검색하신 " + name + " 학생은 2분단 " + (i+1) + "번째 줄 오른쪽에 있습니다.");
					}
				}
			}
		}
		
	}

}
