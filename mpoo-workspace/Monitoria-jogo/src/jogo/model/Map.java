package jogo.model;

import java.util.List;

public class Map {
	private Player personagem;
	
	private List<Camada> camadas;

	public Map(Player personagem, List<Camada> camadas) {
		super();
		this.personagem = personagem;
		this.camadas = camadas;
	}
	
}
