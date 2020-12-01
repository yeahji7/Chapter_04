package chap04.exam05.over;

public class MainOver {

	public static void main(String[] args) {
	//생성자는 한 클래스에 하나만 존재해야함.
		
		Robot r1= new Robot(); 
		Robot r2= new Robot("android_001");
		Robot r3= new Robot("android_001","청소");
		
		//NoteBook이라는 클래스 제작
		//모델, 가격, 색상 필드 
		// 이것들을 이용한  최대한 많은 생성자 오버로드를 만들어보자
	}
	

}
