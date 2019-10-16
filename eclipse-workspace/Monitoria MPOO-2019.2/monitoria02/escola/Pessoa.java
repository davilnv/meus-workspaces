package escola;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void falar(String msg) {
		System.out.println("Formal: " + msg);
	}
	
	public void falar(String titulo, String msg) {
		System.out.printf("Cordial:%n%s%n%s", titulo, msg);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
