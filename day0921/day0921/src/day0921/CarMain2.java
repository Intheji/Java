package day0921;

public class CarMain2 {
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		
		FireEngine fe2 = (FireEngine) car; // 조상타입 객체 -> 자손타입 객체 형변환
		Car car2 = (Car) fe2;			   // 자손타입 객체 -> 조상타입 객체 형변환
		
		car2.drive();
		
		Car c = new Car();
		FireEngine f = (FireEngine)c;
		f.water();
	}
}
