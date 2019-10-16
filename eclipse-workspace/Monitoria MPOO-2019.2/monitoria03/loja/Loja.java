package loja;

public class Loja {
	
	private static Promocao promocao;
	
	private String nome;
	
	public Loja(String nome) {
		this.nome = nome;
	}

	public String vender(float valorTotal) {
		return "Bla";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
