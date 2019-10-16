package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Banco;
import model.Conta;
import model.Corrente;
import model.Poupanca;
import view.Mensagem;
import view.Tela;

public class Controle implements ActionListener{
	private Tela tela;
	
	public Controle(Tela tela) {
		super();
		this.tela = tela;
		
		tela.getMenu().getBtnCadastro().addActionListener(this);
		tela.getMenu().getBtnLogin().addActionListener(this);
		tela.getMenu().getBtnSair().addActionListener(this);
		tela.getCadastro().getBtnVoltar().addActionListener(this);
		tela.getCadastro().getBtnCadastrar().addActionListener(this);
		tela.getLogin().getBtnVoltar().addActionListener(this);
		tela.getLogin().getBtnOK().addActionListener(this);
		tela.getTransferencia().getBtnVoltar().addActionListener(this);
		tela.getTransferencia().getBtnSacar().addActionListener(this);
		tela.getTransferencia().getBtnDepositar().addActionListener(this);
		tela.getTransferencia().getBtnTransferir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if (obj == tela.getMenu().getBtnCadastro()) {
			tela.mudarTela("c");
		} else if (obj == tela.getMenu().getBtnLogin()) {
			tela.mudarTela("l");
		} else if (obj == tela.getMenu().getBtnSair()) {
			System.exit(0);
		} else if (obj == tela.getCadastro().getBtnVoltar()) {
			tela.mudarTela("m");
		} else if (obj == tela.getLogin().getBtnVoltar()) {
			tela.mudarTela("m");
		} else if (obj == tela.getTransferencia().getBtnVoltar()){
			tela.mudarTela("l");
		} else if (obj == tela.getLogin().getBtnOK()) {
			 if (Banco.buscarConta(Integer.parseInt(tela.getLogin().getTfNumeroConta().getText()), tela.getLogin().getTfSenha().getText())) {
				 int numeroConta = Integer.parseInt(tela.getLogin().getTfNumeroConta().getText());
				 Conta conta = Banco.buscarConta(numeroConta);
				 tela.getTransferencia().getLblSaldo().setText("Saldo: "+conta.getSaldo());
				 tela.mudarTela("t");
			 } else 
				 Mensagem.exibirMensagem("Não logado, número de conta ou senha incorreto");
		} else if (obj == tela.getCadastro().getBtnCadastrar()) {
			if (tela.getCadastro().getRbCorrente().isSelected()) {
				if(tela.getCadastro().getTfSenha().getText().equals(tela.getCadastro().getTfConfirmarSenha().getText())) {
					Corrente corrente = new Corrente(Integer.parseInt(tela.getCadastro().getTfNumeroConta().getText()),
							tela.getCadastro().getTfSenha().getText());
					if (Banco.addConta(corrente))
						Mensagem.exibirMensagem("Conta Corrente cadastrada com sucesso!");
					else
						Mensagem.exibirMensagem("Conta já cadastrada!");						
				} else
					Mensagem.exibirMensagem("Erro, senhas não são iguais");
			} else if (tela.getCadastro().getRbPoupanca().isSelected()) {
				if(tela.getCadastro().getTfSenha().getText().equals(tela.getCadastro().getTfConfirmarSenha().getText())) {
					Poupanca poupanca = new Poupanca(Integer.parseInt(tela.getCadastro().getTfNumeroConta().getText()),
							tela.getCadastro().getTfSenha().getText());
					if (Banco.addConta(poupanca))
						Mensagem.exibirMensagem("Conta Poupança cadastrada com sucesso!");
					else
						Mensagem.exibirMensagem("Conta já cadastrada!");						
				} else
					Mensagem.exibirMensagem("Erro, senhas não são iguais");
			}
		}
	}
}
