package Spring5;

public class Vehicle {
	/* A�adidos atributos de la clase veh�culo */
	private String license;
	private String description;
	/* A�adido constructor de la clase veh�culo */
	public Vehicle(String license, String description) {
		this.license = license;
		this.description = description;
	}
	/* Creado m�todo move, para que el veh�culo pueda
	 * moverse.
	 * */
	public double move(Integer km) {
		System.out.println("Moving vehicle: " + this.toString());
		return Math.random() * km;
	}
	/* Creado m�todo toString de la clase veh�culo para
	 * que al hacer un print de la misma, sea esto lo 
	 * que salga por pantalla.
	 * */
	@Override
	public String toString() {
		return "Vehicle [license=" + license +
				", description=" + description +"]";
	}
}
