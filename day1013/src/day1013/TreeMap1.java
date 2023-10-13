package day1013;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(3, "value");
		map.put(2, "value");
		map.put(1, "value");
		map.put(8, "value");
		map.put(32, "value");
		map.put(32, "value");
		map.put(45, "value");
		map.put(111, "value");
		map.put(72, "value");
		map.put(98, "value");
		
		System.out.println("TreeMap : " + map.keySet());
	}
}
