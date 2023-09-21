package day0921;

// 1. 웹툰 목록
// 제목 : 나혼자만 레벨업		장르 : 판타지			작가 : 나혼자
// 제목 : 스위트 집			장르 : 스릴러 			작가 : 김달콤
// 제목 : 이태원 클래식		장르 : 드라마			작가 : 이태원

// 2. 출력 예
// Webtoon {제목 : 나혼자만 레벨업, 장르 : 판타지, 작가 : 나혼자}
// Webtoon {제목 : 스위트 집, 장르 : 스릴러, 작가 : 김달콤}
// Webtoon {제목 : 이태원 클래식, 장르 : 드라마, 작가 : 이태원}
// 총 웹툰의 수 : 3

class Webtoon {
	private String title;
	private String genre;
	private String writer;
	
	private static int count = 0;
	
	
	public Webtoon(String title, String genre, String writer) {
		this.title = title;
		this.genre = genre;
		this.writer = writer;
		count++;
	}
	
//	// 소멸자 : 객체가 소멸될 때 호출
//	protected void finalize() {
//		count--;
//	}
//	
//	public static int getCount() {
//		return count;
//	}
	
	public String toString() {
		return "webtoon { 제목 : " + title + ", 장르 : " + genre + ", 작가 : " + writer + " } ";
	}
	
	public static int getCount() {
		return count;
	}
		
	
}

public class WebtoonMain {
	public static void main(String[] args) {
		Webtoon w1, w2, w3;
		
		w1 = new Webtoon("나 혼자만 레벨업", "판타지", "나혼자");
		w2 = new Webtoon("스위트 집", "스릴러", "김달콤");
		w3 = new Webtoon("이태원 클래식", "드라마", "이태원");
		
//		int[] arr = new int[3];
		
		Webtoon[] webtoons = {w1, w2, w3};
		
		for (int i=0; i<webtoons.length; i++) {
			System.out.println(webtoons[i]);	// toString(); 호출
			// webtoons[i].print();
		}
		
		// 향상된 for문
		for (Webtoon w: webtoons) {
			System.out.println(w);
		}
		
//		System.out.println("Webtoon { 제목 : %s, 장르 : %s, 작가 : %s }, title, genre, writer");
//		System.out.println(w2.);
//		System.out.println(w3);
//		System.out.println("총 웹툰의 수 : " + Webtoon.getCount());
		
		System.out.println(w1.toString());
		System.out.println(w2.toString());
		System.out.println(w3.toString());
		System.out.println("총 웹툰의 수 : " + Webtoon.getCount());
		
	}
}
