package Spring5;

public class Traveller {
	/* Añadidos atributos del viajero */
	private String name;
	/* El viajero necesita crear una instancia de vehículo
	 * porque por cada viajero, hay un vehículo.
	 * */
	private Vehicle vehicle = new Vehicle("0042GOD", "Opel Corsa");
	/* Creado constructor de la clase viajero */
	public Traveller (String name) {
		this.name = name;
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
