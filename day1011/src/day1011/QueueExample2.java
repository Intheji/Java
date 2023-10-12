package day1011;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample2 {
	static Queue q = new LinkedList();
	static int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println("명령어 >> ");
			
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			
			if(input.equalsIgnoreCase("help")) {
				System.out.println("help - 도움말을 보여줍니다.");
				System.out.println("q 또는 Q - 프로그램을 종료합니다.");
				System.out.println("history - 최근에 입력한 명령어 " + MAX_SIZE + "개를 보여줍니다.");
			} else if (input.equalsIgnoreCase("q")) {
				System.exit(0);
			} else if (input.equalsIgnoreCase("history")) {
				// 최근 명령어 보여주기
				save(input);
				
				LinkedList list = (LinkedList) q;
				
				// iterator사용
				Iterator it = list.iterator();
				
				int i=1;
				while(it.hasNext()) {
					System.out.println( (i++) + ". " + it.next());
				}
				// 1. for문 사용
//				final int SIZE = list.size();
//				for (int i=0; i<SIZE; i++) {
//					System.out.println((i+1) + ". " + list.get(i));
//				}
			} else {
				// 명령어 저장
				save(input);
			}	
		}
	} // -- main --
	
	public static void save(String input) {
//		if (input != null && !input.equals("")) {		// null.equals가 말이 안 돼서 이렇게 하는 것
		if (!"".equals(input)) {
			q.offer(input);
		}
		
		if (q.size() > MAX_SIZE) {
			
		}
	}
}
