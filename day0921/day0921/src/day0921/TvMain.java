package day0921;

class MyTv {
	private boolean isPowerOn;	// 전원
	private int channel;		// 채널
	private int volume;			// 볼륨
	private int prevChannel;	// 이전채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	// 최대 볼륨 : 100;
	// 최소 볼륨 : 0;
	// 최대 채널 : 100;
	// 최소 채널 : 1;
	
	// myTv클래스의 멤버변수에 클래스 외부에서는 접근할 수 없도록 제어자를 설정하고
	// 멤버변수에 접근할 수 있도록 getter와 setter를 설정하시오.
	// 단, 볼륨과 채널은 최소 채널과 최대 채널 사이의 값만 설정할 수 있도록 하시오.
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
			return;
		}
		prevChannel = this.channel;		// 잘못 입력했을 때 전 채널로 돌아갑니다
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
}


public class TvMain {
	public static void main(String[] args) {
		MyTv m = new MyTv();
		
		m.setIsPowerOn(true);
		m.setChannel(24);
		System.out.println("channel : " + m.getChannel());
		
		m.setVolume(13);
		System.out.println("volume : " + m.getVolume());
	}
	
	// 이전 채널로 돌아가기
	// 바뀌기 전에 현재 채널 저장 그래서 변수를 만든다
	
	
	
	
}


