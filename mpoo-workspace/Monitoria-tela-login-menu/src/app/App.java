package app;

import controller.Controle;
import view.Tela;
import view.TelaGenerica;

public class App {
	public static void main(String[] args) {
		Tela tela = new Tela("Menu");
		new Controle(tela);
	}
}
