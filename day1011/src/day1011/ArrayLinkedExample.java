package day1011;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis(); //시작시간
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis(); //종료시간
		
		System.out.println("ArrayList 소요시간 : " + (endTime - startTime) + "ms");
		
		
		startTime = System.currentTimeMillis(); //시작시간
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis(); //종료시간
		
		System.out.println("LinkedList 소요시간 : " + (endTime - startTime) + "ms");
	}
}
