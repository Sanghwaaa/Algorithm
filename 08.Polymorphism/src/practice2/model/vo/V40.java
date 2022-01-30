package practice2.model.vo;

public class V40 extends SmartPhone {
	
	public V40() {
		// TODO Auto-generated constructor stub
	}

	// SmartPhone 의 추상메서드 모두 오버라이딩
	@Override
	public void printMaker() {
		// TODO Auto-generated method stub
		super.printMaker();
		System.out.println("V40는 LG에서 만들어 졌다");
	}

	@Override
	public void makeaCall() {
		// TODO Auto-generated method stub
		super.makeaCall();
	}

	@Override
	public void takeaCall() {
		// TODO Auto-generated method stub
		super.takeaCall();
	}

	@Override
	public void picture() {
		// TODO Auto-generated method stub
		super.picture();
		System.out.println("1200, 1600만 화소 트리플 카메라");
	}

	@Override
	public void touch() {
		// TODO Auto-generated method stub
		System.out.println("정전식");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		super.charge();
		System.out.println("고속충전");
	}

}
