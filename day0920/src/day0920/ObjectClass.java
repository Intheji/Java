package day0920;

class Point1 {
	int x;
	int y;
}

class Circle1 {
	Point1 p = new Point1();
	int r;
}

public class ObjectClass {
	public static void main(String[] args) {
		
		Circle1 c = new Circle1();
		
		System.out.println(c.toString());	// 객체가 만들어진 주소 (16진수)
		
		Circle1 c1 = new Circle1();
		
		System.out.println(c1.toString());
		
//		System.out.println(c == c1); 		// 주소가 다르기 때문에 같다고 볼 수 없음
		
		// println에 참조변수만 들어오면
		// 알아서 toString을 호출하여 출력함
		System.out.println(c); 				// toString이랑 똑같이 나옴 = 
		System.out.println("a");
		
		
	}

}
