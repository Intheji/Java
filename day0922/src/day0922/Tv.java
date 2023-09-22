package day0922;

public class Tv extends Product {

	Tv() {
		super(1000);
		bonusPoint = (int)(price * 0.01);
		
//		System.out.println(price);
//		System.out.println(bonusPoint);
	}
	
	public String toString() {
		return "Tv";
	}
}
