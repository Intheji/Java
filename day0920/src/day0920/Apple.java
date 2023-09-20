package day0920;

public class Apple extends Phone {
	
	Apple() {}
	
	Apple(String name, String spec, int cost) {
		super(name, spec, cost);
	}
}

// 생성자를 부모 것을 가져와서 알아서 생성한다
// 여기다 값을 줄려면 기본 생성자가 있어야 된다