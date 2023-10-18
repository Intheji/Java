package BooksManagement;

public class Book {
	private String title;		// 책 제목
	private String author;		// 저자 이름
	private int price;			// 책 가격
	
	// 생성자
	public Book() {}
	
	//매개변수 생성자
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 북정보

	@Override
	public String toString() {
		return "책 제목: " + title + "\n저자 이름: " + author + "\n가격: " + price;
	}
	
	
}
