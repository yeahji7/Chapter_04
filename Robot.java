package chap04.exam05.over;

public class Robot {

	//오버로드(Overload)
	// : 같은 이름으로 여러개를 만들 수 있는것. (생성자, 메서드 둘다 가능)
	// 무조건이 아니라 매개변수의 갯수나 형태가 달라야함.
	
	//아래 예시는 생성자 오버로드 (Robot이라는 같은 이름으로 매개변수가 다른 여러개의 생성자를 만들어냄
	public Robot() {  //매개변수 0개 
	
	}

	public Robot(String string) {  // 매개변수 1개
		
	}

	public Robot(String string, String string2) {  // 매개변수2개
	
	}

}
