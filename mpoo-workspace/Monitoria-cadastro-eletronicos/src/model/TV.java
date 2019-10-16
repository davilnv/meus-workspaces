package model;

public class TV extends Eletronico{
	private float voltagem;
	private boolean possuiControleRemoto;
	
	public TV(String marca, double valor, String modelo, float polegadasTela, float voltagem,
			boolean possuiControleRemoto) {
		super(marca, valor, modelo, polegadasTela);
		this.voltagem = voltagem;
		this.possuiControleRemoto = possuiControleRemoto;
	}

	public float getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}

	public boolean isPossuiControleRemoto() {
		return possuiControleRemoto;
	}

	public void setPossuiControleRemoto(boolean possuiControleRemoto) {
		this.possuiControleRemoto = possuiControleRemoto;
	}
	
}
