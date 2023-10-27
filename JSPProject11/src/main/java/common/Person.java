package common; //기본패키지 이외의 패키지(1)

public class Person {
	//멤버변수는 private(2)
	private String name;
	private int age;
	
	//기본생성자(3)
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// public으로 선언된 getter/setter (4,5)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
