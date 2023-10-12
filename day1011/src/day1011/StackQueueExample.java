package day1011;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		//Stack에 추가
		st.push("0");
		st.push("1");
		st.push("2");
		
		//Queue에 추가
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
//		System.out.println(st.search("0"));
		System.out.println("--stack--");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("--Queue--");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
