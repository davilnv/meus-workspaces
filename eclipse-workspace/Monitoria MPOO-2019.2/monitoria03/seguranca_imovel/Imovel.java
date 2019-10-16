package seguranca_imovel;

import java.util.ArrayList;

public class Imovel {
	
	private ArrayList<Acesso> acessos = new ArrayList<Acesso>();
	
	public void adicionarAcesso(Acesso acesso, Usuario administrador) {
	}
	
	public void removerAcesso(Acesso acesso, Usuario administrador) {
		
	}

	public ArrayList<Acesso> getAcessos() {
		return acessos;
	}

	public void setAcessos(ArrayList<Acesso> acessos) {
		this.acessos = acessos;
	}
}
