package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDeDados;
import model.Usuario;
import view.Cadastro;
import view.Login;
import view.Mensagem;

public class Controle implements ActionListener{
	private Login tela;
	private Cadastro cadastro;
	private BaseDeDados baseDeDados;

	public Controle(Login tela, Cadastro cadastro , BaseDeDados baseDeDados) {
		this.tela = tela;
		this.cadastro = cadastro;
		this.baseDeDados = baseDeDados;

		tela.getBtnOK().addActionListener(this);
		cadastro.getBtnCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tela.getBtnOK()) {
			if (baseDeDados.buscarUsuario(tela.getTfLogin().getText(), tela.getTfSenha().getText())) {	
				Mensagem.mensagem("Usuário logado com Sucesso!");
			} else
				Mensagem.mensagem("Usuário não logado, login ou senha incorreto");
		} else if (e.getSource() == cadastro.getBtnCadastrar()) {
			if (cadastro.getTfSenha().getText().equals(cadastro.getTfConfirmarSenha().getText())) {
				Usuario usuario = new Usuario(cadastro.getTfLogin().getText(), cadastro.getTfSenha().getText());
				if (baseDeDados.addUsuario(usuario))
					Mensagem.mensagem("Usuário cadastrado com sucesso!");
				else
					Mensagem.mensagem("Usuário já cadastrado");
			}	
		}
	}
}
