package practice3.model.vo;

public abstract class Animal { // 추상메서드 포함하고 있으므로 추상클래스 표시
	
	private String name;
	private String kinds;
	
	protected Animal() { // --> 같은 패키지 내, 다른 패키지 자손클래스까지 
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "나의 이름은 " + name + "이고, 종은 " + kinds + "입니다.";
	}
	
	public abstract void speak(); // 추상메서드
	
}
