package practice2.model.vo;

public interface CellPhone extends Phone, Camera {
	// 인터페이스는 인터페이스로만 상속 가능
	// 인터페이스는 다중상속 가능 
	
	void charge(); // 충전방식 

}
