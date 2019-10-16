package view;

public class Tela extends TelaGenerica {
	
	private Menu menu;
	private Cadastro cadastro;
	private Transferencia transferencia;
	private Login login;

	public Tela(String titulo) {
		super(titulo, 180, 370);
		
		menu = new Menu("Menu");
		cadastro = new Cadastro("Cadastro");
		transferencia = new Transferencia("Transferência");
		login = new Login("Login");
		
		add(menu, "m");
		add(cadastro, "c");
		add(transferencia, "t");
		add(login, "l");
		
		mudarTela("m");
		
		setVisible(true);
	}

	public Menu getMenu() {
		return menu;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public Transferencia getTransferencia() {
		return transferencia;
	}

	public Login getLogin() {
		return login;
	}
	
}
