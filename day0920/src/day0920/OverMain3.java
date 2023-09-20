package day0920;

// 아무도 상속을 받지 않아서 object를 상속 받는다
class A3 extends Object {
	
	int num1;
	int num2;
	
	public A3() {}
	
	public A3(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	// Object에서 가지고 있는 것
	// toString() : 문자열로 반환
	public String toString() {		// toString()을 호출을 하긴 하는데 없어도 됨
		return "num1 : " + num1 + ", num2 : " + num2;
	}
}


public class OverMain3 {
	public static void main(String[] args) {
		A3 a3 = new A3(10, 20);
		
		System.out.println(a3.toString());
	}
}
