package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animal = new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		animal[0] = new Dog("누룽지", "리트리버", 5);
		animal[1] = new Cat("까미", "코숏", "한국", "치즈색");
		animal[2] = new Dog("망고", "치와와", 3);
		animal[3] = new Cat("딸기", "코숏", "한국", "하얀색");
		animal[4] = new Cat("코코", "메인쿤", "러시아", "검은색");
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(int i = 0; i < animal.length; i++) {
			if(animal[i] instanceof Dog) { // 형변환 가능하면 
				animal[i].speak(); // 호출 
			} else if(animal[i] instanceof Cat) {
				animal[i].speak();
			}
		}

	}

}
