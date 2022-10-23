package Adapter;

public class Main {
	public static void main(String[] args) {

		LightBulb lightBulb = new LightBulb().setVoltaje(50);

		PowerAdapter powerAdapter = new PowerAdapter(lightBulb);

		enciende(powerAdapter);
		isTurnOn(powerAdapter);
		apagar(powerAdapter);
		isTurnOn(powerAdapter);

	}

	public static void enciende(Enchufable enchufable) {
		enchufable.turnOn();
	}

	public static void apagar(Enchufable enchufable) {
		enchufable.turnOff();
	}

	public static void isTurnOn(Enchufable enchufable) {
		System.err.println(enchufable.isTurnOn() ? "Se prendio" : "Ya se apago");
	}
}
