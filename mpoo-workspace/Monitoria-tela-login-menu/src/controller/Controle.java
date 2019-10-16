package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Tela;

public class Controle implements ActionListener{
	private Tela tela;
	
	public Controle(Tela tela) {
		super();
		this.tela = tela;
		
		tela.getMenu().getBtnLogin().addActionListener(this);
		tela.getMenu().getBtnCadastro().addActionListener(this);
		tela.getMenu().getBtnSair().addActionListener(this);
		tela.getLogin().getBtnVoltar().addActionListener(this);
		tela.getCadastro().getBtnVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if (obj == tela.getMenu().getBtnLogin()) {
			tela.mudarTela("l");
		} else if (obj == tela.getMenu().getBtnCadastro()) {
			tela.mudarTela("c");
		} else if (obj == tela.getMenu().getBtnSair()) {
			System.exit(0);
		} else if (obj == tela.getLogin().getBtnVoltar()) {
			tela.mudarTela("m");
		} else if (obj == tela.getCadastro().getBtnVoltar()) {
			tela.mudarTela("m");
		}
	}
}
