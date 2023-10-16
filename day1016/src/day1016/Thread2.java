package day1016;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i + " ");
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread t = new Thread(new MyRunnable());
		
		t.start();
	}
}
