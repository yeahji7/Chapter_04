package chap04.exam01.classDefine;


public class Main { 

	
	public static void main(String[] args) {
	
		//class(Student)를 복사해서 class(Student) 형태의 std1 변수에 담는다
		Student std1 =new Student();
		
		//class 복사해서 std2에 만들기
		Student std2= new Student();
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std1.equals(std2));

}
}
