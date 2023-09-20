package day0920;

public class Phone {
	String name;
	String spec;
	int cost;
	
	// 기본 생성자
	Phone() {}
	
	// 매개변수 3개짜리 생성자
	Phone(String name, String spec, int cost) {
		this.name = name;
		this.spec = spec;
		this.cost = cost;
	}
	
	// 출력 메서드 생성
	void phoneInfo () {
		System.out.println("제품명 : " + name);
		System.out.println("스펙 : " + spec);
		System.out.println("가격 : " + cost);
	}
}
