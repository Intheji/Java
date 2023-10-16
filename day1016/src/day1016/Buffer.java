package day1016;

public class Buffer {
	private int data;	//생산자로부터 소비자로 전해지는 데이터
	
	// 생산자가 기다리고 있으면 true,
	// 소비자가 기다리고 있으면 false
	private boolean empty = true;
	
	// 케잌이 생산될 때까지 기다리는 메서드
	public synchronized int get() {
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
		// 상태를 토글한다
		empty = true;
		
		notifyAll();
		return data;
	}
	
	// 생산자
	// 케익이 소비될 때까지 기다린다
	public synchronized void put(int data) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = false;
		this.data = data;
		notifyAll(); // 소비자를 깨움
		
	}
}
