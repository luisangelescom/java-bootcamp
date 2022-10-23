package Prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {

		Coche c = new Coche();
		c.puerta = 4;
		Coche c1 = c.clonar();

		System.err.println(c1.puerta);

	}
}
