package Lab;

public class Driver {

	private int cin;
	private String name;
	private int age;
	private Car car;
	
	// constructor
	public Driver(int cin, String name, int age) {
		this.cin = cin;
		this.name = name;
		this.age = age;
	}
	
	// list of getters and setters 
	public int getCin() {
		return cin;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String toString(){
		return "Our driver "+ this.getName() + " with the cin: "+ this.getCin()+ " has bought a new car.\n"+ this.getCar().toString() +"\nThe price of "+ this.getName()+"'s car is: "+ this.getCar().getPrice()+"\n";
	}

}
