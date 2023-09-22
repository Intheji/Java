package day0922;

public class Transportation {
	
	void run (Vehicle1 v) {
		v.show();
	}
	
	void speed(Vehicle1 v) {
		if (v instanceof Car1) {
			v.setSpeed(80);
		} else if (v instanceof Plane) {
			v.setSpeed(1200);
		}
	}
}
