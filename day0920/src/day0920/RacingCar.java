package day0920;

public class RacingCar extends Car {
	int course;
	
	
	RacingCar() {
		super();
		course = 0;
		System.out.println("레이싱카가 생성되었습니다.");
		
		}
	void setCourse(int course) {
			this.course = course;
			System.out.println("코스 번호를 " + course + "로 설정하였습니다.");
	}
}
