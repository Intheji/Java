package day1012;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	public int stuNum;
	public String name;
	public Student(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return stuNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Student)) return false;
		Student stu = (Student) obj;
		if (stu.stuNum == stuNum) return true;
		return false;
		
//		if (obj instanceof Student) {
//			Student stu = (Student) obj;
//			
//			if (stu.stuNum == stuNum) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
	}
}

public class SetExample4 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();		//object를 지정할 수 있으니까 객체를 저장하는 것 제네릭?
		
		set.add(new Student(1, "김그린"));
		set.add(new Student(2, "정디비"));
		set.add(new Student(1, "김자바"));
		
//		System.out.println(set);
		// 학번이 동일한 경우 동일한 학생으로 가정하고 중복저장 되지 않도록 설정
		// 학생의 학번은 각 객체의 해쉬코드로 가정한다.
		
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.stuNum + " : " + stu.name);
		}
		
		
		
	}

	
	
}
