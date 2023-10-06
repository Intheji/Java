package day1006;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] words = {"java", "database", "spring", "springboot", "jsp"};
		
		int index = (int) (Math.random() * words.length);
		
		String str = words[index];
		
		StringBuffer answer = new StringBuffer(str.length());		// 기본으로 16칸을 잡아주지만, length만큼 공간을 잡아줌
		
		for (int i=0; i<str.length(); i++) {
			answer.append("_");
		}
		// System.out.println(str);
		
		int cnt = 0;
		
		while(true) {
			
			cnt++;
			
			System.out.println("현재 상태 > " + answer);
			
			System.out.println("글자를 입력하세요 > ");
			char s = sc.next().charAt(0);
			
//			for (int i=0; i<str.length(); i++) {
//				if (s == str.charAt(i)) {
//					answer.setCharAt(i, s);
//				}
//			}
			
			// replace로
			for (int i=0; i<str.length(); i++) {
				if (s == str.charAt(i)) {
					int in = str.indexOf(s, i);
					if (in != -1) {
						answer.replace(in, in+1, String.valueOf(s));
					}
				}
			}
			
			System.out.println();
			
			
			if (str.equals(answer.toString())) {
				System.out.println("정답입니다. ");
				System.out.println(cnt  + "번 만에 맞혔습니다.");
				break;
			} else if (cnt > 10) {
				System.out.println("정답은 " + str + "입니다.");
				break;
			}
			
		}
	}
}
