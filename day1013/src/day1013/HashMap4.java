package day1013;

import java.util.Hashtable;
import java.util.Map;

class Student {
	public int sno;
	public String name;
	
	// key를 쓸 때 String을 많이 쓴다
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return ((sno == student.sno) && name.equals(student.name));
		} else {
			return false;
		}
	}
		
}

public class HashMap4 {
	public static void main(String[] args) {
//		Map<Student, Integer> map = new HashMap<>();
		Map<Student, Integer> map = new Hashtable<>();
		
		map.put(new Student(1, "김그린"), 95);
		map.put(new Student(1, "김그린"), 90);
		
		System.out.println("총 Entry 수 : " + map.size());
	}
}
