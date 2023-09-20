package day0920;

public class Child extends Parent {
	
	String name;
	String hobby;

	public Child(String name, String hobby) {
		this.name = name;
		this.hobby = hobby;
	}
	
	@Override
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("hobby: " + hobby);
	}
}
