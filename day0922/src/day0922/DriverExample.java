package day0922;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver dr = new Driver();
		
		Bus b = new Bus();
		dr.drive(b);
		
		Taxi t = new Taxi();
		dr.drive(t);
		
	}
}
