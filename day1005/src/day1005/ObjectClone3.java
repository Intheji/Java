package day1005;


class Test implements Cloneable {
	String str;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ObjectClone3 {
	public static void main(String[] args) {
		// 얕은 복사
		Test test = new Test();
		test.str = "abc";
		Test copy = test;
		
		System.out.println(test.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(test.equals(copy));
		
		
		try {
			Test test2 = new Test();
			test2.str = "abc";
			Test copy2 = (Test) test2.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		Test test2 = new Test();
		test2.str = "abc";
		Test copy2 = test2;
		
		System.out.println(test2.hashCode());
		System.out.println(copy2.hashCode());
		System.out.println(test2.equals(copy2));
	}
}
