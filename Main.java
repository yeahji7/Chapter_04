package chap04.exam01.classDefine;


public class Main { 

	
	public static void main(String[] args) {
	
		//class(Student)�� �����ؼ� class(Student) ������ std1 ������ ��´�
		Student std1 =new Student();
		
		//class �����ؼ� std2�� �����
		Student std2= new Student();
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std1.equals(std2));

}
}
