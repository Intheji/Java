package day1006;

public class MathExample2 {
	public static void main(String[] args) {
	
		long v1 = Math.round(5.3);
		System.out.println("v1 : " + v1);
		
		double v2 = Math.ceil(8.5);
		System.out.println("v2 : " + v2);
		
		double v3 = Math.rint(5.5);
		System.out.println("v3 : " + v3);
		
		double v4 = Math.rint(8.5);
		System.out.println("v4 : " + v4);
		
		
		// Math.rint() : 짝수로 결과를 나타내도록 반올림처리	 .5가 많을 경우에 많이 쓴다 더 정밀하다
		double sum = 0, sumRound = 0, sumRint = 0;
		for (double i=1.5; i<=10.5; i++) {
			sum += i;
			sumRound += Math.round(i);
			sumRint += Math.rint(i);
		}
		
		System.out.println("sum : " + sum);
		System.out.println("sumRound : " + sumRound);		// round는 5부터 다 올리고
		System.out.println("sumRint : " + sumRint);
	}
}
