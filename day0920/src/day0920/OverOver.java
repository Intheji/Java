package day0920;

class Parent1 {
	void print() {
		System.out.println("Parent1 클래스의 print() 메서드입니다.");
	}
}

class Child1 extends Parent1 {
	// 오버라이딩
	@Override
	void print() {
		System.out.println("Child1 클래스의 print() 메서드입니다");
	}
	
	// 오버로딩
	void print(String str) {
		System.out.println(str);
	}
	
}

public class OverOver {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.print(); // 오버라이딩 호출
		c1.print("오버로딩된 print() 메서드 출력");		// 오버로딩 출력
	}
}
