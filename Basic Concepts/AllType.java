package projectJava;
class vehicle{
	public void horn() {
		System.out.println("horn is click");
	}
	public void gearUp() {
		System.out.println("gearing Up");
	}
	public void seatBelt() {
		System.out.println("wear seat belt please");
	}
}
 class Bike extends vehicle{
	public void horn() {
		System.out.println("horn is click on bike");
	}
	public void gearUp() {
		System.out.println("gearing up in bike");
	}
}
 class Car1 extends vehicle{
	 public void horn() {
			System.out.println("horn is click in car1");
		}
		public void gearUp() {
			System.out.println("gearing Up in car1");
		}
		public void seatBelt() {
			System.out.println("wear seat belt please");
		}
 }
 class Car2 extends Car1{
	 public void gearDown() {
		 System.out.println("Slow down please, speed breaker");
	 }
 }
public class AllType {
	
	public static void main(String []args) {
		Car2 c= new Car2();
		c.gearDown();
		c.gearUp();
	}
}
