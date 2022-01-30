package practice3.model.vo;

public class Cat extends Animal {
	
	private String location;
	private String color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() // 부모클래스 toString
		+ "내가 태어난 곳은 " + location + "이고, 색은 " + color + "입니다.");
	}

}
