package model;

public class Poupanca extends Conta{
	private final int DV = 1;

	public Poupanca(int numeroConta, String senha) {
		super(numeroConta, senha);
	}

	public int getDV() {
		return DV;
	}

}
