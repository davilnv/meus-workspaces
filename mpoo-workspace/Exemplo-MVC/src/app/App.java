package app;

import controller.Controller;
import model.BaseDados;
import view.Login;
import view.TelaGenerica;

public class App {
	public static void main(String[] args) {
		Login login = new Login("Login");
		TelaGenerica cadastro = new TelaGenerica("Cadastro","Login: ","Senha: ","Confirmar Senha: ");
		TelaGenerica cadastroProduto = new TelaGenerica("Cadastro Produto", "Nome: ", "Codigo: ", "Preço: ");
		new Controller(login, cadastro, cadastroProduto);
		
	}
		
}
