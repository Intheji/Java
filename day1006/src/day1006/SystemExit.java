package day1006;

public class SystemExit {
	public static void main(String[] args) {
		
		// return : 메서드 종료
		// break : 반복문 실행 강제로 종료
		// System.exit(상태코드) : 프로그램 강제 종료
		// 상태코드 : 0 - 정상종료 / 0이외의 값 - 비정상종료
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			
			if (i==5) {
				System.exit(0);
			}
		}
		
		System.out.println("끝!!!!!!");
	}

}
