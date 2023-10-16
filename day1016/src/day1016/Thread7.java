package day1016;

class Counter {
	private int value = 0;
	
	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	public void printCounter() {
		System.out.println(value);
	}
}


class ThreadTest7 extends Thread {
	Counter sharedCounter;
	
	public ThreadTest7(Counter c) {
		this.sharedCounter = c;
	}
	
	public  void run() {
		int i=0;
		while (i<2000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			
			if (i % 50 == 0) {
				sharedCounter.printCounter();
			}
			int time = (int) (Math.random() * 2);
			
			try {
				sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}

public class Thread7 {
	public static void main(String[] args) {
		Counter c = new Counter();
		
		new ThreadTest7(c).start();
		new ThreadTest7(c).start();
		new ThreadTest7(c).start();
		new ThreadTest7(c).start();
	}
}
