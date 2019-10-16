public class Corrente extends Conta{
    public Corrente(String nomeCliente, String cpf, int numeroConta, int agencia) {
        super(nomeCliente, cpf, numeroConta, agencia);
        this.setSaldo(100);
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void transferir(double valor, int numeroConta, int agencia) {

    }

    @Override
    public void mostrarInfo() {
        System.out.println("-------------------------");
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número Conta: " + this.numeroConta);
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println();
    }

    @Override
    public String toString() {
        return nomeCliente + " -- " + agencia + " -- " +numeroConta;
    }
}
