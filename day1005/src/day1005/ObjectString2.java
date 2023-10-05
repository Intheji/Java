package day1005;

public class ObjectString2 {
	
	public static void emailTest(String str) {
		// 메일 주소가 맞는지 확인하는 메서드
		// 1. 반드시 '@'가 포함
		// 2. 반드시 '.'가 포함
		// 3. '@'는 '.'보다 먼저 나와야 함
		
		int at = str.indexOf("@");
		int dot = str.indexOf(".");
		
		if (at != -1 && dot != -1 && at < dot) {
			System.out.println("ok");
		} else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		
		String email1 = "test@naver.com";
		String email2 = "test@navercom";
		String email3 = "testnavercom";
		String email4 = "test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);
	}
}
