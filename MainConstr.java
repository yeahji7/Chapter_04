package chap04.exam04.Constr;

public class MainConstr {

	public static void main(String[] args) {
		
		//Robot이 객체화 될 때 이름과 목표를 정해준다 => 초기화
		//이름 :B123 / 목표:청소
		
		RobotConstr robot = new RobotConstr("B123", "청소");//Robot이라는 타입을 받을 변수(robot)를  복사해서 쓴다는 의미.
		System.out.println("로봇의 이름 : "+robot.name);
		System.out.println("로봇의 목표 :"+robot.goal);
		
	}

}
