package day0920;

public class FlowerMain {
	public static void main(String[] args) {
		Rose r = new Rose("장미", 1500);
		r.flowerInfo();
		
		Tulip t = new Tulip ("튤립", 2000);
		t.flowerInfo();
	}
}
