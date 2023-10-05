package day1005;

public class ObjectHashCode {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str2));
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
