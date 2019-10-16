package sistema_login;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();;
	
	public static boolean addUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (usuario.equals(user)) {
				return false;
			}
		}
		return usuarios.add(usuario);
	}
	
	public static boolean removerUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (usuario.equals(user)) {
				return usuarios.remove(usuario);
			}
		}
		return false;
	}
	
	public static boolean buscarUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (usuario.equals(user)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		BaseDados.usuarios = usuarios;
	}
}
