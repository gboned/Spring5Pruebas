package Spring5;

public class Vehicle {
	/* Añadidos atributos de la clase vehículo */
	private String license;
	private String description;
	/* Añadido constructor de la clase vehículo */
	public Vehicle(String license, String description) {
		this.license = license;
		this.description = description;
	}
	/* Creado método move, para que el vehículo pueda
	 * moverse.
	 * */
	public double move(Integer km) {
		System.out.println("Moving vehicle: " + this.toString());
		return Math.random() * km;
	}
	/* Creado método toString de la clase vehículo para
	 * que al hacer un print de la misma, sea esto lo 
	 * que salga por pantalla.
	 * */
	@Override
	public String toString() {
		return "Vehicle [license=" + license +
				", description=" + description +"]";
	}
}
