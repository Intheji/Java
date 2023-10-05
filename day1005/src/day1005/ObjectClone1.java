package day1005;

class Point {
	public int x;
	public int y;
}

public class ObjectClone1 {
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = p1;
		
		p1.x = 10;
		p1.y = 20;
		
		p2.x = 30;
		p2.y = 0;
		
		System.out.println("p1.x : " + p1.x);
		System.out.println("p1.y : " + p1.y);
		
		System.out.println("p2.x : " + p2.x);
		System.out.println("p2.y : " + p2.y);
		
	}
}
