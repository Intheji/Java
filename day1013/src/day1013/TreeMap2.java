package day1013;

import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(80, "김그린");
		map.put(77, "정자바");
		map.put(88, "박디비");
		map.put(66, "최제이");
		map.put(85, "인마이");
		map.put(42, "최봄");
		
		System.out.println("ceilingEntry() : " + map.ceilingEntry(80));
		// 동일한 키가 있으면 리턴하고 아니면 바로 위에 있는 거 리턴
		// TreeMap이라 오름차순으로 정렬됨
	}
}
