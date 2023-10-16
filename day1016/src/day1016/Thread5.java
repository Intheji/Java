package day1016;

class ThreadTest6 extends Thread {
	int seq;
	
	public ThreadTest6(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq + " thread start");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class Thread5 {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			Thread t = new ThreadTest6(i);
		}
	}
}
