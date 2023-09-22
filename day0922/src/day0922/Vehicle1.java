package day0922;

public abstract class Vehicle1 {
	protected int speed;		// 다른 클래스에 상속받은 거까지 가능 default도 가능
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "로 설정하였습니다.");
	}
	
	abstract void show();
}
