package day0920;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	// 어노테이션 : 메타데이터(하나의 데이터에 대한 설명을 의미하는 데이터)
	@Override		// 꼭 어노테이션이 있어야만 실행되는 것이 아니고 자동으로도 붙여 줄 수도 있다
	public void move() {
		System.out.println("네 다리로 걸어다닌다.");
	}
	
	@Override
	public void cry() {
		System.out.println("앙앙!!");
	}
}
