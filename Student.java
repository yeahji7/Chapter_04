package chap04.exam01.classDefine;

public class Student {
	//이 안에 어떤 변수와 메서드 들이 들어올지 예상해보자
	/* 변수 : 학번, 이름, 수강과목
	 *  메서드 : 수강과목 확인(), 정보확인(), 수강신청(), 수강취소()
	 */

		

	
	//변수
	String std_no; //학번은 수가 크기때문에 int보다는 string 권장
	String std_name;
	String[] sub_list;
	
	//메서드
	public void getSubList() {} //카멜표기법 //수강과목
	public void getInfo() {} //정보확인
	public void select() {} //수강신청
	public void cancel() {} //수강취소
	
	
	
	

}
