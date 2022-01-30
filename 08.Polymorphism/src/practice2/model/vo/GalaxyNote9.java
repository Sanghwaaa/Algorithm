package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
	}

	// SmartPhone 의 추상메서드 모두 오버라이딩
	@Override
	public void printMaker() {
		// TODO Auto-generated method stub
		super.printMaker();
		System.out.println("갤럭시 노트 9은 삼성 에서 만들어 졌다");
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
		System.out.println("1300만 듀얼카메라");
	}

	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		super.charge();
		System.out.println("고속 충전, 고속 무선 충전");
	}

}
