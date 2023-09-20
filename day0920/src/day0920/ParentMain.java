package day0920;

public class ParentMain {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo();
		
		System.out.println("----------------------------");
		
		Child c = new Child("child", "swimming");
		c.printInfo();
	}

}
