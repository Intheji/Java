package day1013;

import java.util.HashMap;
import java.util.Map;

public class MapEntry1 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		for (String key : map.keySet()) {
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
		
		//Map.Entry이용
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
	}
}
