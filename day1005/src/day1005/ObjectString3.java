package day1005;

public class ObjectString3 {
	public static void main(String[] args) {
		int iVal = 100;
		// 1. int를 String으로 변환
		String strVal = String.valueOf(iVal);
	
		double dVal = 200.0;
		
		
		// 2. double을 String으로 변환
		String strVal2 = dVal + "";
		
		System.out.println(iVal + dVal);
		System.out.println(strVal + strVal2);
		
		// 문자열을 숫자로 변환
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(sum);
		System.out.println(sum2);
		
		// split("문자열") : 해당 문자열을 구분자로 나누어서 배열에 저장함
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// join("구분자", 문자열) : 문자열 사이에 구분자를 넣어서 결합함
		
		String str = String.join("-", arr);
		System.out.println(str);
		
		System.out.println(arr[0] + "-" + arr[1] + "-" + arr[2]);
		
		
	}
}
