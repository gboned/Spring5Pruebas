package Spring5;

public class Train implements Vehicle {
	private String description;

	public Train(String license, String description) {
		this.description = description;
	}
	
	public Double move(Integer km) {
		System.out.println("Moving vehicle: " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Train [description=" + description + "]";
	}
}
