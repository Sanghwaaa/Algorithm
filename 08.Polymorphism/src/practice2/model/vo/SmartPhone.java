package practice2.model.vo;

public class SmartPhone implements CellPhone, TouchDisplay { 
	// 추상클래스가 인터페이스를 상속받을 때 implements 사용 
	// 상속 받는 순간 추상클래스 명시 or 부모클래스에 있는 추상메서드 강제 오버라이딩 
	// --> implements 한 인터페이스의 추상메서드가 오버라이딩 됨 
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMaker() {
		
	}

	// 모든 핸드폰의 공통되는 부분만 해당 메서드서 수행한다.
	@Override
	public void makeaCall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}

	@Override
	public void takeaCall() {
		System.out.println("전화받기 버튼을 누름");
	}

	@Override
	public void picture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		
	}

}
