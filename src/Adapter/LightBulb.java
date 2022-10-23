package Adapter;

public class LightBulb {
	private boolean isTurnOff = false;
	int voltaje = 0;

	public LightBulb setVoltaje(int voltaje) {
		this.voltaje = voltaje;
		return this;
	}

	public void prender(int voltaje) {
		this.isTurnOff = true;
		this.voltaje = voltaje;
	}

	public void apagar() {
		this.isTurnOff = false;
		this.voltaje = 0;
	}

	public boolean isTurnOn() {
		return this.isTurnOff;
	}

}
