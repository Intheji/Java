package day0920;

public class Animal {
	// 고양이와 강아지의 공통점을 정의
	String name; 	// 이름
	int age;		// 나이
	
	public Animal() {}	// 기본 생성자
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void move() {
		System.out.println("동물은 움직인다!!!!!!!!");
	}
	
	public void cry() {
		System.out.println("동물은 운다ㅠㅠㅠㅠ");
	}
	
	public void animalInfo() {
		System.out.printf("%s는 %d살입니다. \n", name, age);
	}
}
