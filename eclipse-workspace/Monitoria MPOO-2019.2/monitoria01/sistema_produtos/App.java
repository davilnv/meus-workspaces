package sistema_produtos;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		Produto produto = new Produto(
				"Feijão", 500, LocalDate.of(2019, 10, 22), false);
		BaseDados.addProduto(produto);
		System.out.println(BaseDados.buscarProduto("Feijão"));
		System.out.println(BaseDados.removerProduto(produto));
		System.out.println(BaseDados.buscarProduto("Feijão"));
		System.out.println(Validar.isVencido(produto));
	}
}
