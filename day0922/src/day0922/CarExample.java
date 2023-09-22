package day0922;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.t = new Tire();
		myCar.run();
		
		myCar.t = new HankookTire();
		myCar.run();
		
		myCar.t = new KumhoTire();
		myCar.run();
	}
}


