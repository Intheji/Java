package day1005;

public class StringBuilder1 {
	public static void main(String[] args) {
		// 522p
		// 스프링부트에서 많이 쓰니까 꼬옥 기억하기
		StringBuilder data = new StringBuilder();
		data.append("abc");
		data.append("xyz");
		data.append("123");
		
		System.out.println(data);
		
		// 메서드 체이닝 제이쿼리에서 많이 씀
		String data1 = new StringBuilder()
				.append("a")
				.append("b")
				.insert(0, "zzz")
				.toString();
		
		System.out.println(data1);
		
		
		
		
		// StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append("aaa");
		sb.append("bbb");
		sb.append("ccc");
		
		System.out.println(sb);
		
		// 스트링버퍼 체이닝
		String data2 = new StringBuffer()
				.append("xxx")
				.append("yyy")
				.append("zzz")
				.toString();
		
		System.out.println(data2);
	}
}
