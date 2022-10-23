package Decorator;

public class TelefonoNextGen extends TelefonoDecorador {

	public TelefonoNextGen(Telefono telefono) {
		super(telefono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear() {
		super.crear();
		System.err.println("-->nextGen Tambien tengo 5G");
		System.err.println("-->nextGen Tambien tengo VoLTE");
	}

}
