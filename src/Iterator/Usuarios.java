package Iterator;

import java.util.List;
import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

	private List<Usuario> users = new ArrayList<Usuario>();
	private int position = 0;

	public void createUser(Usuario user) {
		users.add(user);
	}

	@Override
	public Usuario siguiente() {
		Usuario user = users.get(position);
		this.position++;
		return user;
	}

	@Override
	public boolean hasMas() {

		return position < users.size();
	}

	@Override
	public void reiniciar() {
		this.position = 0;
	}

}
