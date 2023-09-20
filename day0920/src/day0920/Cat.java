package day0920;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void move() {
		System.out.println("두 발로 점프한다");
	}
	@Override
	public void cry() {
		System.out.println("느야아앙므엙!");
	}
	
}
