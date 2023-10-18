package day1018;

public class Score {
	private String name;
	private int score;
	
	public Score() {};
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public char getGrade() {
		if (score>=900)
			return 'A';
		else if(score>=750)
			return 'B';
		else if(score>=600)
			return 'C';
		else if(score>=450)
			return 'D';
		else
			return 'F';
	}
	
	
	@Override
	public String toString() {
		return "name : " + name + ", score : " + score;
	}


}
