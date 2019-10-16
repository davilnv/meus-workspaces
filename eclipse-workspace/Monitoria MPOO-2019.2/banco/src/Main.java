import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 999;
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        while (op != 0) {
            menu.menu_principal();
            System.out.print(">>> ");
            op = teclado.nextInt();
            System.out.println();
            if (op == 1) {
                ControladorAdmin controleAdmin = new ControladorAdmin();
                controleAdmin.iniciaAdmin();
            } else if (op == 2) {
                ControladorCaixaEletronico controleCaixa = new ControladorCaixaEletronico();
                controleCaixa.iniciarCaixa();
            } else if (op == 0) {
                break;
            } else {
                System.out.println("Opção digitada inválida!");
            }
        }
        teclado.close();
    }
}
