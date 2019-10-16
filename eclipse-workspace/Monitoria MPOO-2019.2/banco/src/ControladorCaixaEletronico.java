import java.util.Scanner;

public class ControladorCaixaEletronico {
    public void iniciarCaixa() {
        int op = 999;
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        while (op != 0) {
            menu.menu_caixa();
            System.out.print(">>> ");
            op = teclado.nextInt();
            System.out.println();
            if (op == 1) {
                System.out.println("Teste 1");
            } else if (op == 0) {
                break;
            } else {
                System.out.println("Opção digita inválida!");
            }
        }
    }
}
