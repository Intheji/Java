package day1011;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample2 {
	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		String expression = "((5+6)*(3-2))";
		// 괄호의 쌍이 잘 맞는지 확인
		System.out.println(expression);
		
		try {
			for (int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch=='(') {
					st.push(ch+"");
				} else if (ch==')') {
					st.pop();
				}
			}
			
			if (st.isEmpty()) {			// 열고닫고가 딱 맞아있으면
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
		
	}
}
