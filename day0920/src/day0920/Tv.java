package day0920;

public class Tv {
	
	boolean power; 	// 전원상태
	int channel;	// 채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
		
	}
	
	void channelDown() {
		--channel;
	}
}
