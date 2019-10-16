package sistema_login;

public class App {
	public static void main(String[] args) {
		Usuario usuario = new Usuario("jack", "1234");
		BaseDados.addUsuario(usuario);
		System.out.println(Validador.validarUsuario(usuario));
	}
}
