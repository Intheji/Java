package day1018;

//토익 점수를 이용하여 평균점수와 최고 점수를 받은 사람과 점수 출력하고
//각 사람의 등급을 표시하시오.
// [점수 등급]
// 900점 이상 : A
// 750~900 미만 : B
// 600~750 미만 : C
// 450~600 미만 : D
// 나머지는 F로 출력

// [입력값]
// 이름/점수 : 김그린/988, 정자바/562, 이디비/800, 박제이/350




public class Example1 {
	public static void main(String[] args) {
		ScoreArray scoreArr = new ScoreArray(4);
		
		scoreArr.addScore(new Score("김그린", 988));
		scoreArr.addScore(new Score("정자바", 562));
		scoreArr.addScore(new Score("이디비", 800));
		scoreArr.addScore(new Score("박제이", 350));
		
		scoreArr.printAllScores();
		
		System.out.println("평균점수 : " + scoreArr.getAverage());
		System.out.println("최고점수 : " + scoreArr.getMaxscore());
		
	}
}
