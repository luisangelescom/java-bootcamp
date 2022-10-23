package Decorator;

public class Main {

	public static void main(String[] args) {

		// TelefonoBasico telefonoBasico = new TelefonoBasico();
		// telefonoBasico.crear();

		// TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new
		// TelefonoBasico());
		// telefonoInteligente.crear();

		Telefono tel = new TelefonoBasico();

		TelefonoNextGen telfonoNextGen = new TelefonoNextGen(new TelefonoInteligente(tel));
		telfonoNextGen.crear();
	}
}
