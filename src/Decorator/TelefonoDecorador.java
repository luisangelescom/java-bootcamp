package Decorator;

public class TelefonoDecorador implements Telefono {
	Telefono telefono;

	public TelefonoDecorador(Telefono telefono) {
		this.telefono = telefono;
	}

	@Override
	public void crear() {
		this.telefono.crear();
	}

}