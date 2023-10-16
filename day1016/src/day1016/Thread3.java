package day1016;

class ThreadTest1 extends Thread {
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println(getName());
		}
	}

}

class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			//Thread.currentThread() : 현재 실행중인 스레드를 반환
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}

public class Thread3 {
	public static void main(String[] args) {
		
		ThreadTest1 t1 = new ThreadTest1();
		
		Thread t2 = new Thread(new ThreadTest2());
		
		t1.start();
		t2.start();
	}
}
