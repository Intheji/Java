package day0922;

public class Mart2 {
	public static void main(String[] args) {
		Buyer2 b2 = new Buyer2();
		
//		Tv t = new Tv();
//		b.buy(t);
		
		b2.buy(new Tv());
		b2.buy(new Computer());
		b2.buy(new Audio());
		
		b2.Summary();
		
	}

}
