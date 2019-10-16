package seguranca_imovel;

import java.util.ArrayList;

public class Acesso {
	private static boolean acessivel = true;
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Acesso(boolean acessivel) {
		Acesso.setAcessivel(acessivel);
	}
	
	public boolean isAdmin(Usuario administrador) {
		return administrador.getTipo().equals("admin");
	}
	
	public boolean isUser(Usuario usuario) {
		for (Usuario user : usuarios)
			if (user.getLogin().equalsIgnoreCase(usuario.getLogin()) && user.getSenha().equals(usuario.getSenha()))
				return true;
		return false;
	}

	public boolean addUsuario(Usuario usuario, Usuario administrador) {
		if (isAdmin(administrador) && !isUser(usuario))
			return usuarios.add(usuario);
		return false;
	}
	
	public boolean removerUsuario(Usuario usuario, Usuario administrador) {
		if (isAdmin(administrador) && isUser(usuario))
			return usuarios.remove(usuario);
		return false;
	}
	
	public boolean entrar(Usuario usuario) {
		if (isUser(usuario) && acessivel)
			return true;
		return false;
	}
	
	public boolean sair(Usuario usuario) {
		if (isUser(usuario) && acessivel)
			return true;
		
		return false;
	}
	
	public void desbloquearAcesso(Usuario administrador) {
		if (isAdmin(administrador) && !acessivel)
			acessivel = true;
	}
	
	public void bloquearAcesso() {
		acessivel = false;
	}

	public static boolean isAcessivel() {
		return acessivel;
	}

	public static void setAcessivel(boolean acessivel) {
		Acesso.acessivel = acessivel;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
