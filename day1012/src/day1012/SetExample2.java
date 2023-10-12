package day1012;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		// Set을 이용하여 로또번호 추출하기
		
		Set set = new HashSet();

		
		for (int i=0; set.size()<6; i++) {
			int num = (int) (Math.random()*45) + 1;
			set.add(num);
 		}
		
		System.out.println(set);
		
//		TreeSet ts = new TreeSet(set);
//		System.out.println(ts);
		
		List list = new LinkedList(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		// 매개변수로 list밖에 못 들어감
		// 그래서 set을 쓰고 싶으면 list를 만들어서 넣어주면 됨
	}
}
