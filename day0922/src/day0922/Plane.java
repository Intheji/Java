package day0922;

public class Plane extends Vehicle1 {
	public int flight;
	
	public Plane (int flight) {
		this.flight = flight;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다.");
	}

	@Override
	void show() {
		System.out.println("비행기 편명 : " + flight);
		System.out.println("속도 : " + speed);
		
	}
	
	
}
