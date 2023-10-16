package day1016;

public class ProducerConsumerMain {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		// Producer p = new Producer(buffer);
		// Thread t - new Thread(p);
		// t.start();
		
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}
}
