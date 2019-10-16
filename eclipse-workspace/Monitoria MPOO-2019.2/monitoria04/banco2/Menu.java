package banco2;

public class Menu {
	public static void menu_principal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - Acesso ADMIN");
		System.out.println("2 - Acesso CONTAS");
		System.out.println("0 - Sair");
		System.out.println();
	}
	
	public static void menu_admin() {
		System.out.println("MENU ADMIN");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar Todos");
		System.out.println("3 - Buscar Conta");
		System.out.println("4 - Remover Conta");
		System.out.println("0 - Sair");
		System.out.println();
	}
	
	public static void menu_conta() {
		System.out.println("MENU CONTA");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Transferir");
		System.out.println("4 - Saldo");
		System.out.println("0 - Sair");
		System.out.println();
	}
}
