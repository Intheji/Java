package day1005;

class CloneTest implements Cloneable {
	public int x;
	public int y;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ObjectClone2 {
	public static void main(String[] args) {
		CloneTest c1 = new CloneTest();
		CloneTest c2 = null;
		
		try {
			c2 = (CloneTest) c1.clone();		// 다운테스팅	
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		c1.x = 10;
		c1.y = 20;
		
		System.out.println("c1.x : " + c1.x);
		System.out.println("c1.y : " + c1.y);
		
		System.out.println("c2.x : " + c2.x);
		System.out.println("c2.y : " + c2.y);
	}
		
}
