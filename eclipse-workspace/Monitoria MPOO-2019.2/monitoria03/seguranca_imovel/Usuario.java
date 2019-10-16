package seguranca_imovel;

public class Usuario {
	private String tipo;
	private String login;
	private String senha;
	
	public Usuario(String tipo, String login, String senha) {
		this.tipo = tipo;
		this.login = login;
		this.senha = senha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
