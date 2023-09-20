package day0920;

// 1. Flower.java 생성
// 필드 : name(꽃이름), cost(가격)
// 메서드 : flowerInfo

// 2. Rose.java, Tulip.java 생성
// 3. FlowerMain.java 생성하며 결과 출력
// 장미 1송이의 가격은 1500원입니다.
// 튤립 1송이의 가격은 2000원입니다.

public class Flower {
	String name;
	int cost;


	//기본 생성자
	Flower() {}
	
	// 매개변수 3개짜리 생성자
	Flower(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	// 출력 메서드 생성
	void flowerInfo () {
		System.out.printf("%s 1송이의 가격은 %,d원입니다. \n", name, cost);
	}

}


