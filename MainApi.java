package chap04.exam02.myapi;

public class MainApi {

	public static void main(String[] args) {
		
	
		MyApi myApi=new MyApi();
		//������ a�� ,b�� ���ϴ� ������ plus ��� �޼��带 ���� ������ �ذ���. (�Լ��� ������ٰ� ����)
		//plus�� ���� ������ ����?
		//   / �� �� �ΰ� ** ���̸� �Ķ� �ּ�ó�� ����.
		System.out.println(myApi.plus(10, 20));
		myApi.plus(1, 2);
		
		Test test = new Test();
		System.out.println(test.num(1,3));
		
		
		
		
		
		
		
		
		
	}

}
