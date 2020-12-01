package chap04.exam05.over;

public class TestNotebook {

	String model;
	int price;
	String color;
	
	public TestNotebook() {

}
	public TestNotebook(String model) {
		this.model=model;
	}
	
	public TestNotebook(int price) {
		this.price=price;
	}


	public TestNotebook(String model, int price) {
		this.model=model;
		this.price =price;
		//누가 누군지 헷갈릴 수 있어서 this 붙여줌
}

	public TestNotebook(String m, int p, String  c) {
		model=m;
		price =p;
		color=c;
		//this를 붙이는거 말고 다른 방법?  이름 바꿀수 있다 ex String m , int p
		
	
	}
	
	}
	
	
	
	

