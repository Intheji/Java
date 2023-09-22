package day0922;

public class Student extends Person {
	
	public int studentNo;
	
	public Student(String name, int studentNo) {
//		super();	부모에게 기본생성자가 없어서 쓸 수 없음
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
