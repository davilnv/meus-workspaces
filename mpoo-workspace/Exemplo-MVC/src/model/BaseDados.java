package model;

import java.util.ArrayList;

public class BaseDados {
	//private 4sec
	//type in <>
	private static ArrayList<Produto> baseProduto = new ArrayList<Produto>();
	private static ArrayList<Usuario> baseUsers = new ArrayList<Usuario>();
	
	public static boolean addUser(Usuario user) {
		for(Usuario usuario: baseUsers) {
			if(usuario.getNome().equalsIgnoreCase(user.getNome()))
				return false;
		}
		return baseUsers.add(user);
	}
	
	public static boolean checkUser(String login, String senha) {
		for(Usuario usuario: baseUsers) {
			if(usuario.getNome().equalsIgnoreCase(login) && usuario.getSenha().equals(senha))
				return true;
		}return false;
	}
	
	public static boolean addProduct(Produto produto) {
		for(Produto p: baseProduto) {
			if(p.getCodigo().equals(produto.getCodigo()))
				return false;
		}	
		return baseProduto.add(produto);
	}
	
	public ArrayList<Usuario> getBaseUsers(){
		return baseUsers;
	}
	
	public static ArrayList<Produto> getBaseProduto() {
		return baseProduto;
	}
	
	
}
