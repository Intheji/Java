package day1011;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//1. iterator 객체 생성
		Iterator it = list.iterator();
		
		//2. 값 출력
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
		for (int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
