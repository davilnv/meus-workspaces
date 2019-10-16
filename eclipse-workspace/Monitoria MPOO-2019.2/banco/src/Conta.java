public abstract class Conta {
    String nomeCliente;
    protected String cpf;
    protected int numeroConta, agencia;
    private double saldo;

    public Conta(String nomeCliente, String cpf, int numeroConta, int agencia) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void transferir(double valor, int numeroConta, int agencia);
    public abstract void mostrarInfo();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return nomeCliente + " -- " + agencia + " -- " + numeroConta;
    }
}
