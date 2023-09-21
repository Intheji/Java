package day0921;


class Animal {
	private String name;
	private String color;
	private int age;
	
	static int count;
	
	Animal() {}
	
	Animal(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		++count;
	}
}


public class AnimalMain {

	public static void main(String[] args) {
		Animal a1 = new Animal("김이목화", "베이지색", 4);
		Animal a2 = new Animal("이보코", "턱시도", 2);
		Animal a3 = new Animal("열무", "흰색", 7);
		
		System.out.println("지금까지 접수된 반려동물 수 : " + Animal.count);
	}

}
