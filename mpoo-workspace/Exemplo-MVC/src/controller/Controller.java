package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Usuario;
import model.Produto;
import model.BaseDados;

import view.Login;
import view.Mensagem;
import view.TelaGenerica;

public class Controller implements ActionListener{

	Login login;
	TelaGenerica cadastroUser, cadastroProduto;
	
	
	public Controller(Login login, TelaGenerica cadastroUser, TelaGenerica cadastroProduto) {
		this.login = login;
		this.cadastroUser = cadastroUser;
		this.cadastroProduto = cadastroProduto;
		
		login.getCadastrarButton().addActionListener(this);
		login.getEntrarButton().addActionListener(this);
		cadastroUser.getCadastroButton().addActionListener(this);
		cadastroProduto.getCadastroButton().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login.getEntrarButton()){
			if(BaseDados.checkUser(login.getLoginField().getText(), login.getSenhaField().getText())) {
				login.setVisible(false);
				cadastroProduto.setVisible(true);
			}else
				Mensagem.exibirMensagem("Dados incorretos!");
		}
		
		if (e.getSource() == login.getCadastrarButton()) {
			login.setVisible(false);
			cadastroUser.setVisible(true);
		}
		
		if(e.getSource() == cadastroUser.getCadastroButton()) {
			if(cadastroUser.getField2().getText().equals(cadastroUser.getField3().getText())) {
				Usuario usuario = new Usuario(cadastroUser.getField1().getText(), cadastroUser.getField2().getText());
				if(BaseDados.addUser(usuario)) {
					cadastroUser.setVisible(false);
					login.setVisible(true);
				}else
					Mensagem.exibirMensagem("Usuario j� existente!");
			}else 
				Mensagem.exibirMensagem("Senhas nao coincidem");
			cadastroUser.setVisible(false);
			login.setVisible(true);
		}
		
		if(e.getSource() == cadastroProduto.getCadastroButton()) {
			Produto product = new Produto(cadastroProduto.getField1().getText(),cadastroProduto.getField2().getText(),Float.parseFloat(cadastroProduto.getField3().getText()));
			BaseDados.addProduct(product);
			Mensagem.exibirMensagem("Produto cadastrado");
		}
		
	}	
}
