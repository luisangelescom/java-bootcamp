package Factory;

public class PrecioFactory {
	private Precio precio;

	public PrecioFactory(String country) {

		if (country.equalsIgnoreCase("Espana")) {
			precio = new PrecioEur();
		} else if (country.equalsIgnoreCase("GBP")) {
			precio = new PrecioGBP();
		} else {
			precio = new PrecioUsd();
		}

	}

	public double getPrecio() {
		return precio.getPrice();
	}

}
