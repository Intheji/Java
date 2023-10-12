package day1011;

import java.util.HashSet;
import java.util.Objects;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		
		Person p = (Person) obj;
		
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	
	
	
}

public class HashSetExample3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("aaa", 10));
		set.add(new Person("aaa", 10));
		
		System.out.println(set);
	}
}
