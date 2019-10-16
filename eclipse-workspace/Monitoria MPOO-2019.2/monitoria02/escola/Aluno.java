package escola;

public class Aluno extends Pessoa{


	private float media;
	
	public Aluno(String nome, int idade, float media) {
		super(nome, idade);
		this.media = media;
	}
	
	public void falar(String msg) {
		System.out.println("Informal: " + msg);
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
}
