package banco;

public class Poupanca extends Conta{
	private int digitoVerificador;

	public Poupanca(String nome, double saldo, int digitoVerificador) {
		super(nome, saldo);
		this.digitoVerificador = digitoVerificador;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	@Override
	public String toString() {
		return "---- Conta Poupanca ----\nNome: " + getNome() + "\nSaldo: R$ " + getSaldo() + "\nDigito Verificador: " + digitoVerificador;
	}
}
