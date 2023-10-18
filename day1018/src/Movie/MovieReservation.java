package Movie;

class Seat {
	private boolean isBooked = false;
	MovieInfo obj = new MovieInfo();
	
	
	public void book() {
		if (isBooked) {
			System.out.println("이미 예매된 좌석입니다.");
		} else {
			isBooked = true;
			System.out.println("예매가 완료되었습니다!");
		}
	}
	
	public boolean isBooked() {
		return isBooked;
	}
	
	private Seat[][] seats = {
			{new Seat(), new Seat(), new Seat()},
			{new Seat(), new Seat(), new Seat()},
			{new Seat(), new Seat(), new Seat()},	
	};
	
	public void showSeats(int movieNumber) {
		System.out.println(obj.movies[movieNumber].getTitle() + " 좌석 현황: ");
	}
}

public class MovieReservation {
	
}
