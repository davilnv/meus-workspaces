import java.util.ArrayList;
import java.util.Scanner;

public class ControladorAdmin {
     public void iniciaAdmin() {
        int op = 999;
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        BancoDeDados bancoDeDados = new BancoDeDados();
        while (op != 0) {
            menu.menu_admin();
            System.out.print(">>> ");
            op = teclado.nextInt();
            System.out.println();
            if (op == 1) {
                System.out.print("Qual tipo de Conta deseja criar? Conta [1 - Corrente/ 2 - Poupança] ");
                int opc = teclado.nextInt();
                if (opc == 1) {
                    System.out.print("Nome do Titular: ");
                    String nome = teclado.next();
                    System.out.print("CPF: ");
                    String cpf = teclado.next();
                    System.out.print("Número da Conta: ");
                    int numeroConta = teclado.nextInt();
                    System.out.print("Agência da Conta: ");
                    int agencia = teclado.nextInt();
                    System.out.println();
                    Corrente contaCorrente = new Corrente(nome, cpf, numeroConta, agencia);
                    bancoDeDados.salvarCorrente(contaCorrente);
                } else if (opc == 2) {
                    System.out.print("Nome do Titular: ");
                    String nome = teclado.next();
                    System.out.print("CPF: ");
                    String cpf = teclado.next();
                    System.out.print("Número da Conta: ");
                    int numeroConta = teclado.nextInt();
                    System.out.print("Agência da Conta: ");
                    int agencia = teclado.nextInt();
                    System.out.print("Digito Verificador: ");
                    int digitoV = teclado.nextInt();
                    System.out.println();
                    Poupanca contaPoupanca = new Poupanca(nome, cpf, numeroConta, agencia, digitoV);
                    bancoDeDados.salvarPoupanca(contaPoupanca);
                } else {
                    System.out.println("Opção de conta inválida!");
                }
            } else if (op == 2){
                System.out.print("Escolha uma opção de Listagem\n1 - Listar todas contas corrente\n");
                System.out.println("2 - Listar todas contas poupança\n3 - Listar todas as contas");
                int opc = teclado.nextInt();
                if (opc == 1) {
                    bancoDeDados.listarContaCorrente();
                } else if (opc == 2) {
                    bancoDeDados.listarContaPoupanca();
                } else if (opc == 3){
                    bancoDeDados.listarContaCorrente();
                    bancoDeDados.listarContaPoupanca();
                } else {
                    System.out.println("Opção escolhida inválida!");
                }
            } else if (op == 3){
                System.out.print("Digite o CPF do titular da conta: ");
                System.out.print(">>> ");
                String cpf = teclado.next();
                System.out.println();
                bancoDeDados.buscarContas(cpf);
            } else if (op == 0) {
                break;
            } else {
                System.out.println("Opção digitada inválida!");
            }
        }
    }
}
