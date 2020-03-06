package Spring5;

public class Traveller {
	/* Añadidos atributos del viajero */
	private String name;
	/* Por cada viajero, hay un vehículo. */
	private Vehicle vehicle;
	/* Creado constructor de la clase viajero */
	public Traveller (String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}
	/* Traveller utilizará el interface de Vehicle */
	public void setVehicle() {
		this.vehicle = vehicle;
	}
	/* Cuando se llama a su método move, en verdad se
	 * llama al del vehículo.
	 * */
	public Double move(Integer km) {
		System.out.println("Travelling " + km);
		Double cost = vehicle.move(km);
		return cost;
	}
}
