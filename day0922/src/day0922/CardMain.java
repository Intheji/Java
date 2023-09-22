package day0922;

public class CardMain {
	public static void main(String[] args) {
		
		KCard k = new KCard("국민카드", 50000);
		SCard s = new SCard("삼성카드", 20000);
		
		k.pointInfo();
		s.pointInfo();
	}
}
