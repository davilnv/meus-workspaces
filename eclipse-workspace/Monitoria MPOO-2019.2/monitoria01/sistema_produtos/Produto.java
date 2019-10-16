package sistema_produtos;

import java.time.LocalDate;

public class Produto {
	private String nome;
	private int quantidade;
	private LocalDate validade;
	private boolean isPerecivel;
	
	public Produto(String nome, int quantidade, LocalDate validade, boolean isPerecivel) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.validade = validade;
		this.isPerecivel = isPerecivel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public boolean isPerecivel() {
		return isPerecivel;
	}
	public void setPerecivel(boolean isPerecivel) {
		this.isPerecivel = isPerecivel;
	}
	
	
}
