package day0920;

// 상속이랑 포함관계 같이 사용

public class SmartTvMain {
	public static void main(String[] args) {
		SmartTv sTv = new SmartTv();
		
		if (sTv.power != true) {
			sTv.power();
			System.out.println("Tv를 켭니다.");
		}
		
		sTv.channel = 10;
		sTv.channelUp();
		sTv.channelUp();
		
		
		System.out.println("현재 채널은 " + sTv.channel + "입니다.");
		
		sTv.channelDown();
		System.out.println("현재 채널은 " + sTv.channel + "입니다.");
		
		if (sTv.net.power != true) {
			sTv.net.power();
			System.out.println("넷플릭스를 켭니다.");
		}
		
		// 위에처럼 세 번 안 거쳐도 됨
		sTv.play();
		sTv.ff();
		sTv.rew();
		sTv.stop();
		sTv.play();
		
		
		
		// 넷플릭스를 종료
		if (sTv.net.power == true) {
			sTv.net.power();
			System.out.println("넷플릭스를 끕니다.");
		}
		
		
		
		// Tv를 종료
		if (sTv.power == true) {
			sTv.power();
			System.out.println("Tv를 끕니다.");
		}
		
	}
}
