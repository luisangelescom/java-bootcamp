package Adapter;

public class PowerAdapter implements Enchufable {
	private LightBulb lightBulb;

	public PowerAdapter(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
	}

	@Override
	public void turnOn() {
		lightBulb.prender(lightBulb.voltaje);
	}

	@Override
	public void turnOff() {
		lightBulb.apagar();

	}

	@Override
	public boolean isTurnOn() {

		return lightBulb.isTurnOn();
	}
}
