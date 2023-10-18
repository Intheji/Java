package day1018;

import java.util.ArrayList;

public class ScoreList {
	//ArrayList 사용
	private ArrayList<Score> scores;
	
	public ScoreList() {
		scores = new ArrayList<Score>();
	}
	
	// 점수 추가
	public void addScore(Score score) {
		scores.add(score);
	}
	
	// 점수 가져오기
	public Score getScore(String name) {
		for(Score s : scores) {
			if (s.getName().equals(name)) {
				
			}
		}
		return null;
	}
	
	// 평균
	public double getAverage() {
		if (Scores.size()==0) return 0;
		
		int sum = 0;
		for (Score s : scores) {
			sum += s.getScore();
		}
		
		return (double) sum/scores.size();
	}
	
	// 최대값
	public Score getMaxScore() {
		Score max = null;
		
		for (Score s : scores) {
			if (max == null || s.getScore() > max.getScore()) {
				max = s;
			}
		}
	}
}
