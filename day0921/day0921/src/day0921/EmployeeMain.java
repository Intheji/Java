package day0921;

class Employee{
	private String name;
	private double salary;
	
	private static int count = 0;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		count++;
	}
	
	// 소멸자 : 객체가 소멸될 때 호출
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		
		e1 = new Employee("김그린", 10000);
		e2 = new Employee("이자바", 20000);
		e3 = new Employee("박디비", 30000);
		
		System.gc();
		e1 = null;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
		
		
		System.out.println("현재 직원수 : " + Employee.getCount());
	}
}
