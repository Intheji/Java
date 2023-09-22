package day0922;

public class Computer extends Product {
	
	
	Computer() {
		super(2000);
		// 보너스는 제품가격의 5%
		bonusPoint = (int) (price * 0.1);
	}
	
	public String toString() {
		return "Computer";
	}
	

}
