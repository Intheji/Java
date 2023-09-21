package day0921;

class A1 {
	A1() {
		System.out.println("A메서드");
	}
}

class B1 extends A1 {
	B1() {
		super();
		System.out.println("B메서드");
	}
}


public class TypeTest1 {
	A1 a = new A1();
	B1 b = new B1();
	
	A1 ab = new B1();
	
}
