package model;

public  abstract class Conta {
	private int numeroConta;
	private String senha;
	private double saldo;
	
	public Conta(int numeroConta, String senha) {
		this.numeroConta = numeroConta;
		this.senha = senha;
	}
	
	public boolean depositar (double valor) {
		if (valor > 0 ) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo ) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
