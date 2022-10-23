package Adapter;

public class Horno implements Enchufable {
	boolean isTurnOn = false;

	@Override
	public void turnOn() {
		isTurnOn = true;
	}

	@Override
	public void turnOff() {
		isTurnOn = false;

	}

	@Override
	public boolean isTurnOn() {

		return isTurnOn;
	}

}
