package sistema_login;

public class Validador {
	public static boolean validarUsuario(Usuario usuario) {
		return BaseDados.buscarUsuario(usuario);
	}
}
