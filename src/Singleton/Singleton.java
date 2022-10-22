package Singleton;

public class Singleton {

	private static Singleton singleton;

	private int counter = 0;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}

	public void setCounter() {
		this.counter++;
	}

	public int getCounter() {
		return this.counter;
	}

}
