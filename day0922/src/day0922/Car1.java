package day0922;

public class Car1 extends Vehicle1 {
	int num;
	double gas;
	
	
	public Car1 (int num, double d) {
		this.num = num;
		this.gas = d;
		
		System.out.println("차량번호 : " + num + ", 연료량 : " + d + "인 자동차 생성" );
	}


	@Override
	void show() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
		System.out.println("속도 : " + speed);
		
	}
	
	
}
