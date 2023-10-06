package day1006;

class Dice {
	int sides;		// 주사위 면의 개수
	
	public Dice(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		return (int) (Math.random()*sides) + 1;
	}
}

public class MathExample1 {
	public static void main(String[] args) {
		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		
		// 주사위의 합을 기록할 배열(0~12)
		int[] counts = new int[13];
		
		for (int i=0; i<100; i++) {
			int a = dice1.roll();
			int b = dice2.roll();
			int sum = a+b;
			counts[sum]++;
		}
		
		// 출력
		int max = 0;
		int maxCnt = 0;
		
		int min = 0;
		int minCnt = 0;
		
		
		for (int i=2; i<counts.length;i++) {
			if (max < counts[i]) {
				maxCnt = i;
				max = counts[i];
			} else if (min > counts[i]) {
				minCnt = i;
				min = counts[i];
			}
			
			System.out.printf("%d : %d\n", i, counts[i]);
		}
		
		System.out.println("----------------------");
		System.out.printf("최대 출력 : %d(%d)\n", maxCnt, max);
		System.out.printf("최소 출력 : %d(%d)", minCnt, min);
	}
}
