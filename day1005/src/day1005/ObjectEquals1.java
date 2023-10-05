package day1005;

// object 클래스 예제

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// return this == obj;
		
		// obj는 value를 가지고 있지 않음
		// return this.value = obj.value;
		
		// 형변환 해서 value를 사용할 수 있도록 함
		// Value v = (Value) obj;
		// return this.value == v.value;
		
		
		// 참조변수의 형변환 전에는 반드시 instanceof로 형변환이 가능한지 확인해야 함
		if (obj instanceof Value) {
			Value v = (Value) obj;
			return this.value == v.value;
		} else {
			return false;
		}
	}
}

public class ObjectEquals1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
	
		System.out.println(v1 == v2);
		
		System.out.println(v1.equals(v2));	// false	같지 않은 주소라 다르다고 본다
		
		v2 = v1;
		
		System.out.println(v1.equals(v2));	// true	 	주소 비교를 한다
	}
}
