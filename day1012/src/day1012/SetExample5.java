package day1012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student2 [name = " + name + ", ban = " + ban + ", no = " + no + ", kor = " + kor + ", eng = " + eng + ", math = " + math + "]";
	}

	
	
}

class BanNoAscending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 s1 = (Student2) o1;
			Student2 s2 = (Student2) o2;
			
			int result = s1.ban - s2.ban;
			
			if (result == 0) {
				return s1.no - s2.no;
			}
			
			return result;
		}
		
		return -1;
	}
	
}

public class SetExample5 {
	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<>();
		
		list.add(new Student2("김그린", 2, 1, 70, 90, 70));
		list.add(new Student2("이자바", 2, 2, 60, 100, 100));
		list.add(new Student2("정디비", 1, 3, 100, 100, 100));
		list.add(new Student2("박제이", 1, 1, 90, 70, 80));
		list.add(new Student2("최마이", 1, 2, 80, 80, 90));
		
		//ArrayList에 담긴 학생들이 반과 번호를 기준으로 오름차순 정렬되도록 설정
		//단, 반이 같은 경우 번호를 비교하여 정렬한 후 출력한다.
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
