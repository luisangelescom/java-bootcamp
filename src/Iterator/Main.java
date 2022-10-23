package Iterator;

public class Main {
	public static void main(String[] args) {
		Usuarios iterator = new Usuarios();
		iterator.createUser(new Usuario("1", 2));
		iterator.createUser(new Usuario("2", 2));
		iterator.createUser(new Usuario("3", 2));
		iterator.createUser(new Usuario("4", 2));

		while (iterator.hasMas()) {
			System.err.println(iterator.siguiente().getName());
		}
		iterator.createUser(new Usuario("5", 2));
		System.err.println("------");
		System.err.println(iterator.siguiente().getName());
		iterator.reiniciar();
		System.err.println("------");
		while (iterator.hasMas()) {
			System.err.println(iterator.siguiente().getName());
		}

	}
}
