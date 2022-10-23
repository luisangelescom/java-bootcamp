package Prototype;

public class Coche implements Cloneable {

	public String modelo;
	public String tipo;
	public int puerta;

	public Coche() {
	}

	public Coche clonar() throws CloneNotSupportedException {
		// Coche clon = new Coche();
		// clon.tipo = this.tipo;
		// clon.modelo = this.modelo;
		// clon.puerta = this.puerta;

		return (Coche) this.clone();

	}

	// public String getModelo() {
	// return modelo;
	// }

	// public void setModelo(String modelo) {
	// this.modelo = modelo;
	// }

	// public String getTipo() {
	// return tipo;
	// }

	// public void setTipo(String tipo) {
	// this.tipo = tipo;
	// }

	// public int getPuerta() {
	// return puerta;
	// }

	// public void setPuertas(int puerta) {
	// this.puerta = puerta;
	// }

}
