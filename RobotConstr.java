package chap04.exam04.Constr;

public class RobotConstr {

	//생성자
		public String name;
		public String goal;
	
		public RobotConstr(String name, String goal) {//생성자가 언제 동작되는지 보는지 확인
		System.out.println("제일 먼저 나를 호출"); //객체화 될때 가장 먼저실행되므로 초기화를 생성자에게 해준다.
		
		//받아온 값을 잃어버리지 않기 위해 변수에 저장.
		this.name = name;
		this.goal = goal;
		}
	

}
