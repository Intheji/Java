package day1018;

public class ScoreArray {
	
	// 배열 이용
	private Score[] scores;
	private int count;
	
	public ScoreArray(int size) {
		scores = new Score[size];
		count = 0;
	}
	
	// 점수 추가
	public void addScore(Score score) {
		if (count < scores.length) {
			scores[count] = score;
			count++;
		} else {
			System.out.println("배열에 공간이 없습니다.");
		}
	}
	
	// 점수 가져오기
	public Score getScore() {
		for (int i=0; i<count; i++) {
			if (scores[i].getName().equals(name)) {
				return scores[i];
			}
		}
		
	}
	
	
	// 평균 계산하기
	public double getAverage() {
		double sum = 0.0;
		
		for (int i=0; i<count; i++) {
			sum += scores[i].getScore();
		}
		return sum/count;
	}
	
	// 최대 점수 계산하기
	public Score getMaxscore() {
		if (count == 0) return null;
		
		Score maxScore = scores[0];
		
		for (int i=1; i<count; i++) {
			if (scores[i].getScore() > maxScore.getScore()) {
				maxScore =
			}
		}
		
		return maxScore;
	}
	

	// 출력
	public void
}
