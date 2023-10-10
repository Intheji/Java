package day1010;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		al.add("aaa");
		al.add("bbb");
		al.add(1, "ccc");
		
		al.set(2, "fff");
		
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(i + "번째 요소 : " + al.get(i));
		}
		
		System.out.println("---------------------");
		System.out.println("검색할 값 입력 > ");
		String srh = sc.next();
		
		int idx = 0;
		if(al.contains(srh)) {		//있는지 없는지
			idx = al.indexOf(srh);
			System.out.println(idx + "번째 위치에서 " + al.get(idx) + "검색");
		} else {
			System.out.println("찾는 값이 없음");
		}
		
		System.out.println("--------------------");
		
		System.out.println("삭제할 값 입력 > ");
		srh = sc.next();
		idx = 0;
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			al.remove(idx);
		} else {
			System.out.println("찾는 값이 없음");
		}
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(i + "번째 요소 : " + al.get(i));
		}
		
		//리스트에 있는 데이터 싹 다 지우기
		al.removeAll(al);
		
		if (al.isEmpty()) {
			System.out.println("리스트가 비었음");
			
		} else {
			for(int i=0; i<al.size(); i++) {
				System.out.println(i + "번째 요소 : " + al.get(i));
			}
		}
	}
}
