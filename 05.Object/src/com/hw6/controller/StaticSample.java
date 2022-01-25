package com.hw6.controller;

public class StaticSample {

	private static String value; // 공유하면서 사용할 목적으로 선언한 클래스 변수 ***

	public StaticSample() {
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static void toUpper() {

		// value 필드 값을 모두 대문자로 변경
		value = value.toUpperCase();

	}

	public static void setChar(int index, char c) {

		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		
//		value.charAt(index); --> 값을 뽑아오는 것. 내가 하려는 건 대입하는 것이므로 불가능.
		
		char[] arr = value.toCharArray(); // 문자열을 char 배열로 담아줌 
		
		arr[index] = c;
		value = String.valueOf(arr); // 문자열로 변환 

	}

	public static int valueLength() {

		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		return value.length();

	}

	public static String valueConcat(String str) {

		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		return value + str;

	}

}
