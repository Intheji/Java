package day1016;

public class Producer implements Runnable {

	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			buffer.put(i);
			System.out.println("생산자 : " + i + "번째 케잌을 만들었습니다.");
			
			try {
				Thread.sleep((int) (Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
