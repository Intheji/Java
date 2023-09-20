package day0920;

// Tv는 상속관계
public class SmartTv extends Tv {
	
	// Netflix는 포함관계로 설정
	Netflix net = new Netflix();
	
	int counter = net.counter;
	
	void play() {
		net.play();
	}
	
	void stop() {
		net.stop();
	}
	
	void rew() {
		net.rew();
	}
	
	void ff() {
		net.ff();
	}
}
