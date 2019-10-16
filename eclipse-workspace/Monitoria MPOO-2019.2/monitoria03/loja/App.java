package loja;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Loja> lojas = new ArrayList<Loja>();
		lojas.add(new Loja("Loja 1"));
		lojas.add(new Loja("Loja 2"));
		
		Franquia franquia = new Franquia();
		franquia.setLojas(lojas);
	}
}
