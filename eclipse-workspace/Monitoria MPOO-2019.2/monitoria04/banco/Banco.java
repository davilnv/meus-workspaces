package banco;

public class Banco {
	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca("José", 200, 1);
		System.out.println(poupanca.toString());
		Corrente corrente = new Corrente("Maria", 100);
		System.out.println(corrente.toString());
		transferencia(poupanca, corrente, 100);
		System.out.println(poupanca.toString());
		System.out.println(corrente.toString());
	}
	
	public static void transferencia(Conta origem, Conta destino, double valor) {
		if (origem.sacar(valor) && destino.depositar(valor))
			System.out.println("Sucesso!");
		else
			System.out.println("Insucesso!");
	}
}
