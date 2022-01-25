package com.hw5.controller;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {

		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		return arr; // 메서드 호출한 곳으로 리턴

	}

	public void display(int[] arr) {

		// 전달받은 배열 출력

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void swap(int[] arr, int idx1, int idx2) {

		// 전달받은 배열의 각각의 인덱스 값을 교환

		int temp = 0;

		temp = arr[idx1 - 1]; // index 는 0부터 시작하므로 매개변수-1 헤준다.
		arr[idx1 - 1] = arr[idx2 - 1];
		arr[idx2 - 1] = temp;

	}

	public void sortDescending(int[] arr) {

		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		display(arr);

	}

	public void sortAscending(int[] arr) {

		// 위의 swqp 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		display(arr);

	}

	public int countChar(String str, char c) {

		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}

		return count;

	}

	public int totalValue(int num1, int num2) {

		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)

		int temp = 0;
		int sum = 0;

		while (true) {

			if (num1 < num2) { // num1 이 더 작아야 순차적으로 ++ 해줄 수 있다.

				for (int i = num1 + 1; i < num2; i++) { // num1, num2 가 포함되지 않는 그 사이 값
					sum += i;
				}

				break;

			} else if (num1 > num2) { // num1 이 크다면 두 값을 바꿔준다.

				temp = num1;
				num1 = num2;
				num2 = temp;

			}

		}

		return sum;

	}

	public char pCharAt(String str, int index) {

		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴

		return str.charAt(index - 1); // 인덱스는 0부터 시작하므로

	}

	public String pConcat(String str1, String str2) {
		
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		
		return str1 + str2;
		
	}

}
