package day1012;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class SetExample1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(9);
		list.add(7);
		
		System.out.println(list);
		
		HashSet set = new HashSet(list);	// 중복 제거 (순서X)
		System.out.println(set);
		
		TreeSet tSet = new TreeSet(set); // 오름차순 정렬
		System.out.println(tSet);
		// 오름차순에서 반대로 하면 내림차순 
		
		Stack stack = new Stack();	// 내림차순 정렬
		stack.addAll(tSet);
		// stack이 1234 넣으면 4321 빠져 나오니까 내림차순으로 정리를 함
		
		while(!stack.empty()) {
			System.out.print(stack.pop() + ", ");
		}
		
	}
}
