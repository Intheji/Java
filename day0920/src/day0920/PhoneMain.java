package day0920;

public class PhoneMain {

	public static void main(String[] args) {
		
		Galaxy g = new Galaxy("갤럭시 노트12", "s펜이 내장되어 있다.", 3000000);
		g.phoneInfo();
		
		Apple a = new Apple("아이폰 14", "갬성", 1500000);
		a.phoneInfo();

	}

}
