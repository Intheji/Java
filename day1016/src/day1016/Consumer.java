package day1016;

public class Consumer implements Runnable {
	private Buffer buffer;
	private String data;

	public Consumer(Buffer drop) {
		this.buffer = drop;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			buffer.get();
			System.out.println("소비자 : " + data + "번째 케잌을 구매하였습니다.");
			
			try {
				Thread.sleep((int) (Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
