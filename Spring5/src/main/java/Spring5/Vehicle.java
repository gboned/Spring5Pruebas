package Spring5;

public class Vehicle {
	private String license;
	private String description;
	
	public Vehicle(String license, String description) {
		this.license = license;
		this.description = description;
	}
	
	public double move(Integer km) {
		System.out.println("Moving vehicle: " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Vehicle [license=" + license +
				", description=" + description +"]";
	}
}
