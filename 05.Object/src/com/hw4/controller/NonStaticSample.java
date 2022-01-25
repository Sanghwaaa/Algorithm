package com.hw4.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {

		int[] arr = new int[6];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (i == j) { // 중복제거
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr); // 오름차순 정렬

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void outputChar(int num, char c) { // run 파일에서 매개변수 전달받음

		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}

	}

	public char alphabette() { // char 타입으로 return

		char ch = (char) (Math.random() * 58 + 65); // 65부터 58개의 랜덤값 (즉, 65~122 사이의 랜덤값

		return ch; // 호출한 곳 (run) 으로 리턴

	}

	public String mySubstring(String str, int index1, int index2) { 

//		String result = null;
//		
//		if(!(str.equals(""))) { // str 이 null 이 아니라면
//			
//			for(int i = index1; i < index2; i++) {
//				result += str.charAt(i);
//			}
//			
//		}
//		
//		return result; 

		String result = null;
		
		if(!str.equals("")) {
			result = str.substring(index1, index2); // String 클래스에서 제공하는 substring(시작인덱스, 끝인덱스)
		}
		
		return result; 

	}

}
