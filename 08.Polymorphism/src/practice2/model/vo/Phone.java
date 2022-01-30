package practice2.model.vo;

public interface Phone { 
	// 인터페이스는 선언부만 작성이 가능하다.
	// 추상메서드의 선언부와 구현부를 분리하기 위해 사용하기 때문에! ***
	
	public abstract void makeaCall(); // 전화걸기 --> 명시 
	
	void takeaCall(); // 전화받기 --> 묵시 

}
