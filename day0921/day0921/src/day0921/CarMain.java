package day0921;

public class CarMain {
	public static void main(String[] args) {
		FireEngine f = new FireEngine();
		
		System.out.println(f.color);
		System.out.println(f.door);
		f.drive();
		f.stop();
		f.water();
		
		System.out.println("----------------------------");
		
		Car c = (Car) f;
		
		System.out.println(f.color);
		System.out.println(f.door);
		c.drive();
		c.stop();
//		c.water();
		
		System.out.println("----------------------------");
		
		FireEngine f2 = (FireEngine) c;
		
		System.out.println(f2.color);
		System.out.println(f2.door);
		f2.drive();
		f2.stop();
		f2.water();
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		
//		car.water();	컴파일 에러
		
		fe2 = (FireEngine)car;
		
		fe2.water();
		
	}
}
