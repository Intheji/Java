package day1013;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("정제이", 100);
		map.put("김자바", 50);
		map.put("박그린", 70);
		map.put("최디비", 30);
		
		//entrySet() : Map에 저장되어 있는 key-value를
		//Map.Entry 타입의 객체로 저장한 Set으로 반환
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();	// 공백 한 칸 하고 해야 된다
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("학생 명단 : " + set);
		
		// 학생들의 합계, 평균 최고점수, 최저점수를 계산
		
		Collection values = map.values();
		
		it = values.iterator();
		
		int sum = 0;
		
		while(it.hasNext()) {
			sum += (int) it.next();
		}
		
		System.out.println("함계 : " + sum);
		System.out.println("평균 : " + sum / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최고점수 : " + Collections.min(values));
	}
}
