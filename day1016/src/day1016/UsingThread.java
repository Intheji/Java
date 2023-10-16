package day1016;

class ThreadTest3 extends Thread {
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println();
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - UsingThread.startTime));
	}
}

public class UsingThread {
	static long startTime = 0;
	
	
	public static void main(String[] args) {
		ThreadTest3 th3 = new ThreadTest3();
		
		startTime = System.currentTimeMillis();
		th3.start();
		
		for (int i=0; i<300; i++) {
			System.out.print("|");
		}
		
		System.out.println("소요시간 : " + (System.currentTimeMillis() - UsingThread.startTime));
	}
}
