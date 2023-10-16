package day1016;

class Join1 extends Thread {
	public Join1(String str) {
		setName(str);
	}
	
	public void run() {
		for (int i=1; i<=3; i++) {
			System.out.println(i + getName());
		}
		
		System.out.println("끝 " + getName());
	}
}

public class JoinThread {
	public static void main(String[] args) throws InterruptedException {
		Join1 j1 = new Join1("join1");
		Join1 j2 = new Join1("join2");
		
		System.out.println("--- 스레드 시작 전 ---");
		j1.start();
		j2.start();
		
		j1.join();
		j2.join();
		
		System.out.println("--- 스레드 종료 후 ---");
	}
}
