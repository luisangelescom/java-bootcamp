package Builder;

public class CocheBuilder {
	Vehiculo vehicle;

	public CocheBuilder() {
		vehicle = new Vehiculo();
	}

	public CocheBuilder setMarca(String marca) {
		vehicle.setMarca(marca);
		return this;
	}

	public CocheBuilder setMotor(String motor) {
		vehicle.setMotor(motor);
		return this;
	}

	public CocheBuilder setTipo(String tipo) {
		vehicle.setTipo(tipo);
		return this;
	}

	public CocheBuilder setPuertas(int puertas) {
		vehicle.setPuertas(puertas);
		return this;
	}

	public Vehiculo builder() {
		return vehicle;
	}

}

// Vehiculo vehicle = new CocheBuilder()
// .setTipo("Ford")
// .setMotor("New")
// .setMarca("Car")
// .setPuertas(2)
// .setTipo("T1")
// .builder();

// System.err.println(vehicle.getTipo());
// System.err.println(vehicle.getMarca());
// System.err.println(vehicle.getPuertas());
