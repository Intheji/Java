package day1013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "Z", "D", "K"};
		
		HashMap map = new HashMap();
		
		for (int i=0; i<data.length; i++) {
			if (map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			//숫자만 출력
			// 숫자가 몇 개 있는지 각각 확인 가능
//			System.out.println(entry.getKey() + " : " + entry.getValue());
			// 기호 출력
			int value = (int) entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		
	}
	
	// 출력하기 위한 메서드
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}
}
