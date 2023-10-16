package day1016;

class WorkObject {
	public synchronized void method1() {
		System.out.println("Thread_A의 method1() 작업 실행");
		
	}
	
	public synchronized void method2() {
		System.out.println("Thread_B의 method2() 작업 실행");
		
		notify(); // 일시정지 상태에 있는 Thread를 실행 대기 상태로 만듦
	}
}

class ThreadA extends Thread {
	private WorkObject workObject;
	
	ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	public void run() {
		for (int i=0; i<10; i++) {
			workObject.method1();
		}
	}
}

class ThreadB extends Thread {
	private WorkObject workObject;
	
	ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	public void run() {
		for (int i=0; i<10; i++) {
			workObject.method2();
		}
	}
}

public class Thread8 {
	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		ta.start();
		tb.start();
	}
}
