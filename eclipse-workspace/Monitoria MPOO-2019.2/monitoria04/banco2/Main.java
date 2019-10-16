package banco2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op;
		boolean controle = false;
		while (controle==false) {
			Menu.menu_principal();
			System.out.print(">>> ");
			op = teclado.nextInt();
			if (op == 0) {
				controle = true;
			} else if (op == 1) {
				ControladorAdmin.iniciar_admin();
			} else if (op == 2) {
				System.out.println("Teste 2");
			}
		}
		teclado.close();
	}
}
