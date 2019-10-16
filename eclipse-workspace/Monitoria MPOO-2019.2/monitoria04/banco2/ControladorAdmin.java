package banco2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorAdmin {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void iniciar_admin() {
		int op;
		boolean controle = false;

		Menu.menu_admin();
		System.out.print(">>> ");
		while(controle==false) {
			op = teclado.nextInt();
			if (op == 0) {
				controle = true;
			} else if (op == 1) {
				cadastrar();
			} else if (op == 2) {
				listarTodos();
			} else if (op == 3) {
				buscar();
			} else if (op == 4) {
				removerConta();
			} else {
				System.out.println("Opção Inválida!");
			}
		}
		teclado.close();
	}
	
	private static void cadastrar() {
		SecureRandom aleatorio = new SecureRandom();
		System.out.println("Cadatrando conta...");
		System.out.println("Qual o seu CPF? \n>>>");
		String cpf = teclado.nextLine();
		System.out.println();
		int agencia = aleatorio.nextInt(9999);
		int numConta = aleatorio.nextInt(99999999);
		Conta conta = new Conta(cpf, agencia, numConta); 
		BancoDadosContas.getContas().add(conta);
	}
	
	private static void listarTodos() {
		if (copiaDadosContas() != null)
			for (Conta conta : copiaDadosContas())
				System.out.println(conta.toString());
		else
			System.out.println("Não existe contas cadastradas no Banco");
	}
	
	private static void buscar() {
		
	}
	
	private static void removerConta() {
		
	}
	
	private static ArrayList<Conta> copiaDadosContas() {
		ArrayList<Conta> contas = BancoDadosContas.getContas();
		return contas;
	}
}
