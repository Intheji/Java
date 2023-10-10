package day1010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		//list에 내용 추가
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		//오른쪽으로 숫자만큼 이동
		Collections.rotate(list, 2);
		System.out.println(list);
		
		//0번과 2번 인덱스를 교환
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		//저장된 요소의 위치를 임의로 변경
		Collections.shuffle(list);
		System.out.println(list);
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		//역순으로 정렬(내림차순)
		//Collections.sort(list, Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println(list);
		
		//list에서 저장된 값을 반환
		int idx = Collections.binarySearch(list, 3);
		System.out.println(idx);
		
		//최소, 최대
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list, Collections.reverseOrder()));	//반대로 비교
		
		//list를 해당하는 값으로 채움
		Collections.fill(list, 9);
		System.out.println(list);
		
		List newList = Collections.nCopies(list.size(), 5);
		System.out.println(newList);
		
		//두 list의 공통요소가 없으면 true
		System.out.println(Collections.disjoint(list, newList));
		
		//newList에 있는 내용을 list로 복사
		Collections.copy(list, newList);
		System.out.println(list);
		
		//5를 전부 1로 변경
		Collections.replaceAll(list, 5, 1);
	}
}
