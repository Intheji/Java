package day0920;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog d = new Dog("김이목화", 4);
		d.animalInfo();
		d.move();
		d.cry();
		
		Cat c = new Cat("이보코", 2);
		c.animalInfo();
		c.move();
		c.cry();
		
	}

}
