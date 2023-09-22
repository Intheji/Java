package day0922;

public class InstanceofExample {
	
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if (person instanceof Student) {
			Student stu = (Student) person;	// 강제 형변환
			System.out.println("studentNo : " + stu.studentNo);
			stu.study();
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("김그린");
		personInfo(p1);
		
		
		Person p2 = new Student("이자바", 10);	// 기능은 4개
		personInfo(p2);
	}
}
