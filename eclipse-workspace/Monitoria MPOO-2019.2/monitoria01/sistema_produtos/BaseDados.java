package sistema_produtos;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static boolean addProduto(Produto produto) {
		// produtos.contains(produto);
		for (Produto p : produtos) {
			if (produto.equals(p))
				return false;
		}
		if (!Validar.isVencido(produto))
			return produtos.add(produto);
		return false;
	}
	
	public static boolean removerProduto(Produto produto) {
		for (Produto p : produtos) {
			if (produto.equals(p) && Validar.isVencido(produto))
				return produtos.remove(p);
		}
		return false;
	}
	
	public static Produto buscarProduto(String nome) {
		// produtos.contains(produto);
		for (Produto p : produtos) {
			if (p.getNome().equals(nome))
				return p;
		}
		return null;
	}
	
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		BaseDados.produtos = produtos;
	}
	
	
}
