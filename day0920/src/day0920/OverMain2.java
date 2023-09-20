package day0920;

class A2 {
	
	int num1;
	int num2;
	
	String print() {
		return "num1 : " + ", num2 : " + num2;
	}
}

class B2 extends A2 {
	
	int num3;
	String print() {
		return "num1 : " + num1 + ", num2 : " + num2 + ", num3 : " + num3;
	}
	
}

public class OverMain2 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.print();
		
		
		B2 b2 = new B2();
		b2.num1 = 10;
		b2.num2 = 20;
		b2.num3 = 20;
		
		System.out.println(b2.print());
	}
}
