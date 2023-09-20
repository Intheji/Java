package day0920;

public class Animal1 {
	double weight; 		// 몸무게
	String picture;		// 사진을 저장해 놓은 경로를 저장
	
	void eat() {
		System.out.println("Animal 객체의 eat()이 호출됨");
	}
	
	void roar() {
		System.out.println("Animal 객체의 roar()가 호출됨");
	}
	
	void sleep() {
		System.out.println("Animal 객체의 sleep()이 호출됨");
	}
}
