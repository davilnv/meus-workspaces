import java.util.ArrayList;

public class BancoDeDados {
    ArrayList<Poupanca> dadosPoupanca = new ArrayList<>();
    ArrayList<Corrente> dadosCorrente = new ArrayList<>();

    public void salvarPoupanca(Poupanca conta) {
        this.dadosPoupanca.add(conta);
    }

    public void salvarCorrente(Corrente conta) {
        this.dadosCorrente.add(conta);
    }

    public void listarContaCorrente() {
        for (Corrente conta : dadosCorrente) {
            System.out.println(conta.toString());
        }
    }

    public void listarContaPoupanca() {
        for (Poupanca conta : dadosPoupanca) {
            System.out.println(conta.toString());
        }
    }

    public void buscarContas(String cpf) {
        for (Corrente conta : dadosCorrente) {
            if (conta.cpf.equals(cpf)) {
                conta.mostrarInfo();
            } else {
                System.out.println("Conta Corrente não encontrada");
            }
        }
        for (Poupanca conta : dadosPoupanca) {
            if (conta.cpf.equals(cpf)) {
                conta.mostrarInfo();
            } else {
                System.out.println("Conta Poupança não encontrada");
            }
        }
    }
}
