package day1016;

class PriorityTest extends Thread {
	
	// 생성자에 문자열을 넣으면 스레드의 이름이 됨
	public PriorityTest(String str) {
		setName(str);
		
	}
	
	public void run() {
		for (int i=1; i<5; i++) {
			System.out.println(i + getName() + "우선순위 : " + getPriority());
		}
		
		System.out.println(getName() + "멈춤");
	}
}

public class PriorityThread {
	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest(" 첫번째 스레드 ");
		PriorityTest t2 = new PriorityTest(" 두번째 스레드 ");
		PriorityTest t3 = new PriorityTest(" 세번째 스레드 ");
		
		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
