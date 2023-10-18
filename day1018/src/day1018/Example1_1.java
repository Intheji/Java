package day1018;

public class Example1_1 {
	public static void main(String[] args) {
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(new Score("김그린", 988));
		scoreList.addScore(new Score("정자바", 562));
		scoreList.addScore(new Score("이디비", 800));
		scoreList.addScore(new Score("박제이", 350));
		
		for (Score s : ScoreList.getScores()) {
			System.out.println(s.toString());
		}
		
		System.out.println("평균점수 : " + scoreList.getAverage());
		System.out.println("최대점수 : " + scoreList.getMaxScore());
	}
}
