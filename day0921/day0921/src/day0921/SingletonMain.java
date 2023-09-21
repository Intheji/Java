package day0921;

class Singleton {
	
	private static Singleton single = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return single;
	}
	
	
}

public class SingletonMain {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}
