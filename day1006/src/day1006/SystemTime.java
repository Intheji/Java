package day1006;

public class SystemTime {
	public static void main(String[] args) {
		
		int sum = 0;
		
//		long start = System.currentTimeMillis(); // (1/1000초)
		long start = System.nanoTime(); // 시작시간(1/10^9초)
		
		for (int i=1; i<=1000000; i++) {
			sum += i;
		}
		
//		long end = System.currentTimeMillis(); // 끝시간
		long end = System.nanoTime(); // 끝시간(1/10^9초)
		
		System.out.println("1~1000000의 합계 : " + sum);
		System.out.println("소요시간 : " + (end-start) + "밀리초");
		
	}
}
