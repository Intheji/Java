package day0920;

class Airplane {
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
}


class Supersonic extends Airplane {
	// 상수선언
	public static final int NORMAL = 1;
	
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("엄청 빨리 날아요~~~");
		} else {
			super.fly();
		}
	}
}

public class AirplaneMain {
	public static void main(String[] args) {
		Supersonic ss = new Supersonic();
		
		ss.takeOff();
		ss.fly();
		ss.flyMode = Supersonic.SUPERSONIC;	// 가능하면 이름으로 써주는 것이 좋다
		ss.fly();
		ss.flyMode = Supersonic.NORMAL;
		ss.fly();
		ss.land();
	}
	
}


