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
		//���� ������ �򰥸� �� �־ this �ٿ���
}

	public TestNotebook(String m, int p, String  c) {
		model=m;
		price =p;
		color=c;
		//this�� ���̴°� ���� �ٸ� ���?  �̸� �ٲܼ� �ִ� ex String m , int p
		
	
	}
	
	}
	
	
	
	

