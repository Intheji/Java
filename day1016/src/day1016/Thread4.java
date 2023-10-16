package day1016;

class ThreadTest4 extends Thread {
	public void run() {
		for (int i=0; i<30; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}

class ThreadTest5 extends Thread {
	public void run() {
		for (char i='a'; i<'z'; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}

public class Thread4 {
	public static void main(String[] args) {
		ThreadTest4 t4 = new ThreadTest4();
		ThreadTest5 t5 = new ThreadTest5();
		
//		t4.start();
//		t5.start();
		
		t4.run();
		t5.run();
		// 우왕 순서대로다
		
		// 메인메서드 스레드
		for (char i='A'; i<'Z'; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		
	}
}
