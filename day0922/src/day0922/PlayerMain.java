package day0922;

abstract class Player  {
	
	abstract void play();  // 추상메서트
	
	abstract void stop(); // 추상메서드
}

class MusicPlayer extends Player {
	
	void play() {
		System.out.println("음악을 재생합니다.");
	}
	
	void stop() {
		System.out.println("음악을 정지합니다.");
	}
		
}

public class PlayerMain {
	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();
		mp.play();
		mp.stop();
	}
}
