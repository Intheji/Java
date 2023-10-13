package day1013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김그린", 100);
		map.put("이자바", 90);
		map.put("박제이", 50);
		map.put("김그린", 5);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체 찾기
		System.out.println("김그린 : " + map.get("김그린"));
		// 중복되면 덮어씌운다
		System.out.println();
		
		//출력
		Set<String> keySet = map.keySet();
		
		
		Iterator<String> keyIt = keySet.iterator();
		
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Integer value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		// 객체 삭제
		map.remove("박제이");
		System.out.println("총 Entry의 수 : " + map.size());
		
		System.out.println("----------------");
		
		// 객체를 각각 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
