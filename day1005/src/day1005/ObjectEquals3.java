package day1005;

import java.util.Scanner;

public class ObjectEquals3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pw = "1234";
		
		System.out.print("id > ");
		String id_str = sc.next();
		
		System.out.println("pw > ");
		String pw_str = sc.next();
		
		if (id.equals(id_str) && pw.equals(pw_str)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println ( "로그인 실패");
		}
		
		sc.close();
		
		// API 문서에 스트링 검색
	}
}
