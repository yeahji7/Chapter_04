package chap04.exam04.Constr;

public class MainConstr {

	public static void main(String[] args) {
		
		//Robot�� ��üȭ �� �� �̸��� ��ǥ�� �����ش� => �ʱ�ȭ
		//�̸� :B123 / ��ǥ:û��
		
		RobotConstr robot = new RobotConstr("B123", "û��");//Robot�̶�� Ÿ���� ���� ����(robot)��  �����ؼ� ���ٴ� �ǹ�.
		System.out.println("�κ��� �̸� : "+robot.name);
		System.out.println("�κ��� ��ǥ :"+robot.goal);
		
	}

}
