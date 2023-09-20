package day0920;

public class Car {
	// 필드
	int num;
	double gas;
	// 초기화 블럭 - 초기화 블럭이 있다면 주로 이런 순서로 쓰면 된다
	
	
	// 생성자
	Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	// 메서드
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량번호 : " + num + "으로, 연료량은 " + gas + "로 설정하였습니다.");
	}
	
	// 출력하는 메서드
	
	public void show() {
		System.out.println("차량번호는 " + num + " 입니다.");
		System.out.println("연료량은 " + gas + " 입니다.");
	}
}
