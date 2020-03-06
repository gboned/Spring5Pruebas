package Spring5;

public class Traveller {
	/* A�adidos atributos del viajero */
	private String name;
	/* Por cada viajero, hay un veh�culo. */
	private Vehicle vehicle;
	/* Creado constructor de la clase viajero */
	public Traveller (String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}
	/* Traveller utilizar� el interface de Vehicle */
	public void setVehicle() {
		this.vehicle = vehicle;
	}
	/* Cuando se llama a su m�todo move, en verdad se
	 * llama al del veh�culo.
	 * */
	public Double move(Integer km) {
		System.out.println("Travelling " + km);
		Double cost = vehicle.move(km);
		return cost;
	}
}
