package day0920;

public class Netflix {
	boolean power; // 전원
	int counter = 0;
	
	void power() {
		power = !power;
	}
	
	void play() {
		System.out.println("재생중입니다.");
	}
	
	void stop() {
		System.out.println("정지하였습니다");
	}
	
	void rew() {
		System.out.println("<< 되감기");
	}
	
	void ff() {
		System.out.println(">> 빨리감기");
	}
}
