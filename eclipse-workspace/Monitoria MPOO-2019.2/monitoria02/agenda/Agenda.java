package agenda;

import java.util.ArrayList;

public class Agenda {
	private static ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public boolean adicionar(String nome) {
		Contato contato = new Contato(nome);
		for (Contato c : contatos) {
			if (c.equals(contato))
				return false;
		}
		return contatos.add(contato);
	}
	
	public boolean adicionar(String nome, int numero) {
		Contato contato = new Contato(nome, numero);
		for (Contato c : contatos) {
			if (c.equals(contato))
				return false;
		}
		return contatos.add(contato);
	}
	
	public boolean adicionar(String nome, int numero, boolean favorito) {
		Contato contato = new Contato(nome, numero, favorito);
		for (Contato c : contatos) {
			if (c.equals(contato))
				return false;
		}
		return contatos.add(contato);
	}
	
	public Contato buscar(String nome) {
		for (Contato c : contatos) {
			if (c.getNome().equalsIgnoreCase(nome))
				return c;
		}
		return null;
	}
	public Contato buscar(String nome, int numero) {
		for (Contato c : contatos) {
			if (c.getNome().equalsIgnoreCase(nome) && c.getNumero() == numero)
				return c;
		}
		return null;
	}
	public Contato buscar(int numero) {
		for (Contato c : contatos) {
			if (c.getNumero() == numero)
				return c;
		}
		return null;
	}
	public ArrayList<Contato> buscar(boolean favorito) {
		ArrayList<Contato> favoritos = new ArrayList<Contato>();
		for (Contato c : contatos) {
			if (c.isFavorito())
				favoritos.add(c);
		}
		return favoritos;
	}
	
	public boolean remover(Contato contato) {
		for (Contato c : contatos) {
			if (c.equals(contato))
				return contatos.remove(c);
		}
		return false;
	}
	
	public boolean editar(Contato antigo, Contato novo) {
		for (Contato c : contatos) {
			if (c.equals(antigo)) {
				c.setNome(novo.getNome());
				c.setNumero(novo.getNumero());
				c.setFavorito(novo.isFavorito());
				return true;
			}
		}
		return false;
	}
	
	public void exibirContatos() {
		for (Contato c : contatos) {
			System.out.println(c.toString());
		}
	}
}
