package escola;

public class Professor extends Pessoa{
	private double salario;
	
	public Professor(String nome, int idade, double salario) {
		super(nome, idade);
		this.setSalario(salario);
	}
	
	@Override
	public void falar(String msg) {
		System.out.println("Cordial: " + msg);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
