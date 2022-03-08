package Lab;

public class Car {
	
	private String model;
	private String color;
	private double price;

	
	// constructor
	public Car(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	// list of getters and setters
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// other methods
	public void start() {
		System.out.println("Car is Starting!");
	}

	public void stop() {
		System.out.println("Car is Stopping!");
	}
	
	public String toString(){
		return "\nThe model of the new car is: "+ this.getModel() + ".\nIt has the following color: "+ this.getColor()+ "\n" ;
	}
}
