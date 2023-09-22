package day0922;

public class Mart {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv t = new Tv();
		b.buy(t);
		
		Computer c = new Computer();
		b.buy(c);
		
		Audio a = new Audio();
		b.buy(a);
		
		
		System.out.println("잔액 : " + b.money);
		System.out.println("보너스 포인트 : " + b.bonusPoint);
	}
}
