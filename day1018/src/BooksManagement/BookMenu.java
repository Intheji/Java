package BooksManagement;

import java.util.Scanner;

public class BookMenu {
	// 입력을 위한 스캐너
	Scanner sc = new Scanner(System.in);
	bookController bc = new bookController();
	
	public void displayBookMenu() {
		while(true) {
			System.out.println("===== 도서 관리 프로그램 =====");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 검색");
			System.out.println("3. 전체 도서 목록");
			System.out.println("4. 도서 가격 수정");
			System.out.println("5. 도서 삭제");
			System.out.println("0. 종료");
			System.out.println("=========================");
			System.out.println("메뉴 선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			
		}
	}
	
	
}
