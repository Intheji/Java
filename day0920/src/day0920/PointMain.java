package day0920;

class Point2 {
	int x = 10;
	int y = 20;
	
	Point2(int x, int y) {
		super();				// 얘 조상 object 데려옴
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2 {
	int z = 30;
	
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	
	Point3D() {					// 기본생성자 호출
		this(100, 200, 300);	// 매개변수 세 개짜리 호출
	}
}

public class PointMain {
	
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println("p3.x : " + p3.x);
		System.out.println("p3.y : " + p3.y);
		System.out.println("p3.z : " + p3.z);
	}
}
