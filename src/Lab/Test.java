package Lab;

public class Test {

	public static void main(String[] args) {

		// creating the first object of type Car
		Car car_1 = new Car("Nissan", "Black", 32.560);
		
		// creating the first object of type Driver
		Driver driver_1 = new Driver(12345678, "Sami", 42);
		
		// Sami bought the car
		driver_1.setCar(car_1);
		
		// Displaying information of Sami and his car
		System.out.println(driver_1.toString());

		// Sami is driving his new car
		System.out.println(driver_1.getName() + " is driving his car:");
		driver_1.getCar().start();
		driver_1.getCar().stop();
		
	}

}
