package BookManage;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
	private Set<Book> books = new HashSet<>();
	private Scanner scan = new Scanner(System.in);
	
	// 도서 메뉴 출력
	public void displayMenu() {
		System.out.println("===== 도서 관리 프로그램 =====");
		System.out.println("1. 도서 추가 ");
		System.out.println("2. 도서 검색 ");
		System.out.println("3. 전체 도서 목록 ");
		System.out.println("4. 도서 가격 변경 ");
		System.out.println("5. 도서 삭제");
		System.out.println("6. 종료");
		System.out.println("========================");
	}
	
	// 도서 추가
	public void addBook() {
		System.out.println("책 제목 > ");
		String title = scan.nextLine();
		
		System.out.println("저자 이름 > ");
		String author = scan.nextLine();
		
		System.out.println("가격 > ");
		int price = Integer.parseInt(scan.nextLine());
		
		Book book = new Book(title, author, price);
		books.add(book);
		System.out.println("책이 추가되었습니다.");
	}
	
	// 도서 검색
	public void searchBook() {
		
		System.out.println("책 제목 : ");
		String title = scan.nextLine();
		
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				System.out.println(book.toString()); 	// 동일한 책이 있으면 결과값을 나타내주고 해당 for문에서 빠져나감
				break;
			}
		}
		
		if (!found)
			System.out.println("해당 책을 찾을 수 없습니다.");
	}
	
	// 전체 도서 목록
	public void displayAllBooks() {
		if (books.size() == 0) {
			System.out.println("등록된 책이 없습니다.");
			return;
		}
		
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
	
	// 도서 가격 수정
	public void updateBook() {
		System.out.println("가격을 변경할 책 제목 > ");
		String title = scan.nextLine();
		
		boolean found = false;
		
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				System.out.println("변경할 책 가격 > ");
				int price = scan.nextInt();
				book.setPrice(price);
				System.out.println("도서 가격이 변경되었습니다.");
				found = true;
				break;
			}
		}
		
	}
	
	
	// 도서 삭제
	public void removeBook() {
		System.out.println("삭제할 책 제목 : ");
		String title = scan.nextLine();
		
		boolean found = false;
		
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				books.remove(book);
				System.out.println("도서 정보가 삭제되었습니다.");
				found = true;
				break;
			}
		}
	}
	
	// 종료
}
