package BookManage;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		BookManager bookManager = new BookManager();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			bookManager.displayMenu();
			System.out.println("메뉴 선택 > ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1:
				bookManager.addBook();
				break;
			case 2:
				bookManager.searchBook();
				break;
			case 3:
				bookManager.displayAllBooks();
				break;
			case 4:
				bookManager.updateBook();
				break;
			case 5:
				bookManager.removeBook();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
