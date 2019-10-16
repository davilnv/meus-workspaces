package model;

public class Celular extends Eletronico{
	private float capacidadeBateria;
	private double memoriaROM;
	private double memoriaRAM;
	
	public Celular(String marca, double valor, String modelo, float polegadasTela, float capacidadeBateria,
			double memoriaROM, double memoriaRAM) {
		super(marca, valor, modelo, polegadasTela);
		this.capacidadeBateria = capacidadeBateria;
		this.memoriaROM = memoriaROM;
		this.memoriaRAM = memoriaRAM;
	}

	public float getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public void setCapacidadeBateria(float capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	public double getMemoriaROM() {
		return memoriaROM;
	}

	public void setMemoriaROM(double memoriaROM) {
		this.memoriaROM = memoriaROM;
	}

	public double getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(double memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
}
