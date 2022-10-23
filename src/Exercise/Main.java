package Exercise;

public class Main {
	public static void main(String[] args) {

		SingletonToken singleton = SingletonToken.getInstance();
		// Se inicia el token solo para el singleton que crea la instancia
		singleton.initToken();

		SingletonToken singleton2 = SingletonToken.getInstance();

		// Siguiendo el patron Singleton debe de ser la misma referencia
		System.err.println(singleton.toString());
		System.err.println(singleton2.toString());

		// Siguiendo el patron Singleton debe de ser el mismo token en ambas instancias
		System.err.println(singleton.getTokenCustom());
		System.err.println(singleton2.getTokenCustom());

	}

}
