package Spring5;

public class Traveller {
	/* A�adidos atributos del viajero */
	private String name;
	/* El viajero necesita crear una instancia de veh�culo
	 * porque por cada viajero, hay un veh�culo.
	 * */
	private Vehicle vehicle = new Vehicle("0042GOD", "Opel Corsa");
	/* Creado constructor de la clase viajero */
	public Traveller (String name) {
		this.name = name;
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
