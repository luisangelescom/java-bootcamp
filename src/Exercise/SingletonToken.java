package Exercise;

import java.util.Random;

public class SingletonToken {

	private static SingletonToken singleton;
	private String token;

	private SingletonToken() {
	}

	public static SingletonToken getInstance() {
		if (singleton == null) {
			singleton = new SingletonToken();
		}
		return singleton;
	}

	public void initToken() {
		this.setToken();
	}

	public String getTokenCustom() {
		return this.token;
	}

	private void setToken() {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1)
				.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();

		this.token = generatedString;
	}

}
