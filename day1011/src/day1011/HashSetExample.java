package day1011;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");
		set.add("myBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		set.remove("JDBC");
		set.remove("myBatis");
		
		System.out.println("총 객체수  : " + set.size());
		
		iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		set.clear();
		
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}
}
