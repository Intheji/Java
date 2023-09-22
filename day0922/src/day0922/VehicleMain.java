package day0922;

//1. 추상클래스 이름 : Vehicle1.java
//필드 : speed(속도)
//메서드 : 매개변수로 입력받은 speed를 설정하는 setSpeed메서드
//결과를 출력하는 show() 메서드 생성

//2. Vehicle1을 상속받는 Car.java 클래스 생성
//필드 : num(차량번호), gas(연료량)
//생성자를 통해 차량번호와 연료량을 설정하고 화면에 설정값 출력
//차량번호, 연료량, 속도를 출력하는 메서드 생성

//3. Vehicle1을 상속받는 Plane.java 클래스 생성
//필드 : flight(비행기 번호)
//생성자를 통해 비행기 번호를 설정하고 화면에 설정값 출력
//비행기편명, 속도를 출력하는 메서드 생성

//4. VehicleMain.java 클래스를 생성하여 각 객체를 생성하고 결과를 나타내시오.


public class VehicleMain {
	public static void main(String[] args) {
		
		// 1. 객체 생성
		Car1 c = new Car1(1234, 10.3);
		Plane p = new Plane(789);
		
		c.setSpeed(80);
		c.show();
		
		p.setSpeed(1300);
		p.show();
		
		
		System.out.println("-------------------------------");
		
		
		
		// 2. 다형성 이용하기
		Vehicle1 v1 = new Car1(1234, 10.3);
		Vehicle1 v2 = new Plane(789);
		
		v1.setSpeed(80);
		v1.show();
		
		v2.setSpeed(1300);
		v2.show();
		
		
		System.out.println("-------------------------------");
		
		
		// 3. 객체 배열 사용하기
		Vehicle1[] v4 = new Vehicle1[2];

		
		v4[0] = new Car1(1234, 10.3);
		v4[0].setSpeed(80);
		v4[0].show();
		
		v4[1] = new Plane(789);
		v4[1].setSpeed(1300);
		
		for (int i=0; i<v4.length; i++) {
			v4[i].show();
		}
		
		
		System.out.println("------------------------------");
		
		
		
		// 4. 새로운 클래스를 생성하여 다형성 이용하기
		Transportation t = new Transportation();
		
		Vehicle1 v5 = null;
		v5 = new Car1(1234, 50.6);
		t.speed(v5);
		t.run(v5);
		
		v5 = new Plane(789);
		t.speed(v5);
		t.run(v5);
		
		
	}
}
