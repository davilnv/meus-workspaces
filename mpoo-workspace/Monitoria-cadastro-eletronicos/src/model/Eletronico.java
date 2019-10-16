package model;

public class Eletronico {
	private String marca;
	private double valor;
	private String modelo;
	private float polegadasTela;
	
	public Eletronico(String marca, double valor, String modelo, float polegadasTela) {
		super();
		this.marca = marca;
		this.valor = valor;
		this.modelo = modelo;
		this.polegadasTela = polegadasTela;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPolegadasTela() {
		return polegadasTela;
	}

	public void setPolegadasTela(float polegadasTela) {
		this.polegadasTela = polegadasTela;
	}
	
}
