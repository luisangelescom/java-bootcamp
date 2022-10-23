package Decorator;

public class TelefonoBasico implements Telefono {

	@Override
	public void crear() {
		System.err.println("Este telefono tiene estas caracteristicas:");

		haceSMS();
		haceGMS();

	}

	public void haceSMS() {
		System.err.println("-->Basic: Tengo SMS");
	}

	public void haceGMS() {
		System.err.println("-->Basic: Tengo GMS");
	}

}
