public interface Vehicle {
	void accelerate();
	void brake();
}
public class Bicycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Bicycle is speeding up.");
	}
	
	public void accelerate(String model) {
		System.out.println(model+" cycle is accelerating.");
	}
	
	@Override
	public void brake() {
		System.out.println("Bicycle is applying brakes.");
	}
	
}
public class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating.");
	}
	
	public void accelerate(String model) {
		System.out.println(model+" car is accelerating.");
	}
	
	@Override
	public void brake() {
		System.out.println("Car has been slowed.");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=new Car();
		car.accelerate();
		car.accelerate("Honda");
		car.brake();
		
		Bicycle cycle=new Bicycle();
		cycle.accelerate();
		cycle.accelerate("Avon");
		cycle.brake();
	}

}
