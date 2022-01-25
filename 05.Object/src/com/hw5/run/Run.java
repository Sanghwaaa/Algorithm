package com.hw5.run;

import com.hw5.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample n2 = new NonStaticSample();
		
		int[] arr = n2.intArrayAllocation(5); // 매개변수로 전달할 int[] arr 
		
		System.out.print("크기가 5인 배열의 랜덤값 : ");
		n2.display(arr);
		
		n2.swap(arr, 3, 5);
		System.out.println();
		
		System.out.print("내림차순 출력 : ");
		n2.sortDescending(arr);
		System.out.println();
		
		System.out.print("오름차순 출력 : ");
		n2.sortAscending(arr);
		System.out.println();
		
		System.out.print("apple 문자열에 p의 갯수 : " + n2.countChar("apple", 'p'));
		System.out.println();
		
		System.out.println("13 과 7 사이의 정수들의 합계 : " + n2.totalValue(13, 7));
		
		System.out.println("programming문자열의 3번 인덱스 문자 : " + n2.pCharAt("programming", 3));
		
		System.out.println("JAVA와 programming을 합친 문자열 : " + n2.pConcat("JAVA", "programming"));

	}

}
