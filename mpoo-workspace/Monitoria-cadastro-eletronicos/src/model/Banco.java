package model;

import java.util.ArrayList;

public class Banco {
	private static ArrayList<Eletronico> eletronicos = new ArrayList<Eletronico>();
	
	public boolean addEletronico(Eletronico eletronico) {
		return eletronicos.add(eletronico);
	}
}
