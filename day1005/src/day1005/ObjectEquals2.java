package day1005;

class Color {
	public String type;
	
	public Color(String type) {
		this.type = type;
	}
	
	
	@Override
	public boolean equals(Object obj) {
//		if (obj instanceof Color) {
//			Color c = (Color) obj;
//			return this.type == c.type;
//		} else {
//			return false;
//		}
		if (!(obj instanceof Color))
			return false;
		
		Color c = (Color) obj;
		return this.type == c.type;
	}
	
}

public class ObjectEquals2 {

	public static void main(String[] args) {
		Color c1 = new Color("blue");
		Color c2 = new Color("blue");
		Color c3 = new Color("red");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}
