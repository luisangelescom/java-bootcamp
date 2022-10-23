package Decorator;

public class TelefonoInteligente extends TelefonoDecorador {

	public TelefonoInteligente(Telefono telefono) {
		super(telefono);
	}

	@Override
	public void crear() {
		super.crear();
		System.err.println("-->intel: Tambien tengo 4G");
	}

}
