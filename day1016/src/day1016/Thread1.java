package day1016;

class MyThread extends Thread {
	public void run() { // Thread 클래스의 run()을 오버라이딩
		// 스레드가 실행하는 모든 작업은 run() 메서드 안에 있어야 함
		for (int i = 10; i >= 0; i--) {
			System.out.println(i + " ");
		}
	}
}

public class Thread1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.start();
	}
}
