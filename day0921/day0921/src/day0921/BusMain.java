package day0921;

// 캡슐화

class Bus {
	private int num;		// 차량번호	캡슐화를 위해서 private으로 고친다
	private int count;	// 탑승인원수	 하지만 같은 클래스에서만 가능
	
	public void setNumCount(int num, int count) {
		// private에 접근할 수 있는 이런 메서드를 만들어 줘야 됨
		if(count > 0 && count <= 45) {
			this.num = num;
			this.count = count;
			System.out.println("차량번호 : " + num + ", 탑승 인원수 : " + count);			
		} else {
			System.out.println(count + "는 올바른 탑승 인원이 아닙니다.");
		}
	}
	
	public void show() {
		System.out.println("차량번호: " + num);
		System.out.println("탑승인원: " + count);
	}
	
	
}

public class BusMain {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		
//		bus1.num = 2300;
//		bus1.count = 10;
		
		bus1.setNumCount(2300, 40);
		bus1.setNumCount(2300, 1000);
		
		bus1.show();
		
	}
	
	
}
