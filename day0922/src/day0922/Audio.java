package day0922;

public class Audio extends Product {
	
	Audio() {
		super(500);
		// 보너스는 제품가격의 5%
		bonusPoint = (int) (price * 0.05);
	}
	
	public String toString() {
		return "Audio";
	}

}
