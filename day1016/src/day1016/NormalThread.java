package day1016;


public class NormalThread {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<300; i++) {
			System.out.print("-");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println();
		
		System.out.println("소요시간1 : " + (endTime - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		
		for (int i=0; i<300; i++) {
			System.out.print("|");
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println();
		
		System.out.println("소요시간2 : " + (endTime - startTime) + "ms");
	}
}
