package day0922;

public class SCard extends Card {

	public SCard(String cardCompany, int cardAmt) {
		super(cardCompany, cardAmt);
	}
	
	@Override
	public void pointInfo() {
		pointAmt = (int) (this.cardAmt * 0.03);
		System.out.printf("%s 구매금액 %d원에 대한 적립금은 %d원입니다.\n", cardCompany, cardAmt, pointAmt);
	}
}
