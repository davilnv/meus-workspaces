package view;

public class Tela extends TelaGenerica{
	private Menu menu;
	private Cadastro cadastro;
	private Login login;
	
	public Tela(String titulo) {
		super(titulo);
		init();
		setVisible(true);
	}
	
	public Tela(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		init();
		setVisible(true);
	}

	public void init() {
		menu = new Menu("Menu");
		cadastro = new Cadastro("Cadastro de Usuário");
		login = new Login("Login");
		
		//ligando a string ao componente
		
		add(menu, "m");
		add(login, "l");
		add(cadastro, "c");
		
		mudarTela("m");
	}

	public Menu getMenu() {
		return menu;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public Login getLogin() {
		return login;
	}
}
