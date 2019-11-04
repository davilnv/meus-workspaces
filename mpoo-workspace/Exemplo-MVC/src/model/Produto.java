package model;

public class Produto {
	String Nome;
	String Codigo;
	Float Preco;
	
	public Produto(String nome, String codigo, Float preco) {
		Nome = nome;
		Codigo = codigo;
		Preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Float getPreco() {
		return Preco;
	}

	public void setPreco(Float preco) {
		Preco = preco;
	}	
}
