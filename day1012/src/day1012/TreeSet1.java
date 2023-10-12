package day1012;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Test implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
	
}

class TestComp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}

public class TreeSet1 {
	public static void main(String[] args) {
		Set set = new TreeSet(new Test());
		
//		for (int i=0; i<10; i++) {
//			int num = (int)(Math.random()*100) + 1;
//			set.add(num);
//		}
//		
//		System.out.println(set);
		
		// treeset은 정리되어서 나오고 hashset은 정리 안 되어서 나온다
		// 중복허용이 되지 않아서 실행하는 거에 따라 9개가 나올 수도 10개가 나올 수도 있다.
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		
		System.out.println(set);
	}
}
