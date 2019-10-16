public class Poupanca extends Conta{
    private int digitoVerificador;

    public Poupanca(String nomeCliente, String cpf, int numeroConta, int agencia, int dv) {
        super(nomeCliente, cpf, numeroConta, agencia);
        this.digitoVerificador = dv;
        this.setSaldo(150);
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    @Override
    public void transferir(double valor, int numeroConta, int agencia) {
        System.out.println("Função ainda não disponível");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("-------------------------");
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número Conta: " + this.numeroConta + "-" + this.digitoVerificador);
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println();
    }

    @Override
    public String toString() {
        return nomeCliente + " -- " + agencia +" -- " + numeroConta + "-" + digitoVerificador;
    }
}
