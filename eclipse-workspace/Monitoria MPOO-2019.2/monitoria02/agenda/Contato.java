package agenda;

public class Contato {
	private String nome;
	private int numero;
	private boolean favorito;
	
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public Contato(String nome, int numero, boolean favorito) {
		this.nome = nome;
		this.numero = numero;
		this.favorito = favorito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	@Override
	public String toString() {
		return "-------------------\nNome: " 
				+ nome + "\nNúmero: " + numero + "\nFavorito: " + favorito;
	}
	
	
}
