package app;

import controller.Controle;
import model.Banco;
import model.Corrente;
import view.Tela;

public class App {
	public static void main(String[] args) {
		Tela tela = new Tela("BANCO");
		Corrente conta = new Corrente(123, "123");
		Banco.addConta(conta);
		new Controle(tela);
	}
}
