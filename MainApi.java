package chap04.exam02.myapi;

public class MainApi {

	public static void main(String[] args) {
		
	
		MyApi myApi=new MyApi();
		//복잡한 a와 ,b를 더하는 내용을 plus 라는 메서드를 통해 간단히 해결함. (함수를 만들었다고 이해)
		//plus에 대한 설명서는 없네?
		//   / 에 별 두개 ** 붙이면 파란 주석처럼 변함.
		System.out.println(myApi.plus(10, 20));
		myApi.plus(1, 2);
		
		Test test = new Test();
		System.out.println(test.num(1,3));
		
		
		
		
		
		
		
		
		
	}

}
