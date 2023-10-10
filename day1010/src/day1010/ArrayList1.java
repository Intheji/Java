package day1010;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		//ArrayList에는 객체만 저장 가능
		//기본형 타입의 값을 입력하면 autoboxing되어서 
		list1.add(5);
		list1.add(4);
		list1.add(1);
		list1.add(3);
		list1.add(0);
		list1.add(2);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println(list1.containsAll(list2));
		
		
		//내용 추가
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		//내용 변경
		list2.set(3, "AAA");
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		
		//자료형이 다르기 때문에 다른 값으로 나옴
		System.out.println("index : " + list1.indexOf("1"));
		System.out.println("index : " + list1.indexOf(1));
		
		//인덱스 위치의 값을 지우기
		list1.remove(1);
		
		//1이라는 숫자를 지우기(값을 지우기)
		//list1.remove(new Integer(1));
		list1.remove(Integer.valueOf(1));
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println(list1.retainAll(list2));
		print(list1, list2);
		
		//부분 삭제
//		for(int i=0; i<list2.size(); i++) {
//			list2.remove(i);
//		}
//		
//		print(list1, list2);
//		
//		for (int i=list2.size()-1; i>=0; i--) {
//			list2.remove(i);
//		}
//		
//		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i=list2.size()-1; i>0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
