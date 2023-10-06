package day1006;

public class WrapperExample1 {
	public static void main(String[] args) {
		Integer obj1 = 100;					// 오토 박싱, 이게 더 최근 방식이고 이렇게 쓰면 된다
		System.out.println(obj1);
		
		
		Integer obj2 = new Integer(100);		// 11버전 이후론 이거 안 돌아감
		System.out.println(obj2);
		
		Integer obj3 = Integer.valueOf(300);
		System.out.println(obj3);
		
		Integer obj4 = Integer.parseInt("400");
		System.out.println(obj4);
		
		
		// 언박싱
		int value1 = obj1.intValue();
		
		System.out.println(value1);
		
		obj2++;	// obj2 = new Integer(obj2.intValue() + 1);
		System.out.println(obj2);
		
		
	}
}
