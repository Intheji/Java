package day0920;

class A1 {
	void hello() {
		System.out.println("A1을 출력합니다.");
	}
}

class B1 extends A1 {
	void hello() {
		System.out.println("B1을 출력합니다.");
		System.out.println("요게 바로 오버라이딩!!");
	}
}

public class OverMain1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.hello();
		
		B1 b1 = new B1();
		b1.hello();
	}
}
