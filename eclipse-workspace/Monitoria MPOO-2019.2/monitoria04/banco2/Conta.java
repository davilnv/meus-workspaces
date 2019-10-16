package banco2;

public class Conta {
	private String cpf;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public Conta(String cpf, int agencia, int numeroCona) {
		super();
		this.cpf = cpf;
		this.agencia = agencia;
		this.numeroConta = numeroCona;
		this.saldo = 0.0;
	}
	
	public boolean sacar(double valor) {
		return true;
	}
	
	public boolean depositar(double valor) {
		return true;
	}
	
	public boolean transferir(Conta contaDestinoConta, double valor) {
		return true;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero Conta: " + numeroConta + ", Saldo: R$" + saldo;
	}
	
}
