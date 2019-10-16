package escola;

public class App {
	public static void main(String[] args) {
		Professor professor = new Professor("Faustão", 60, 6254);
		professor.falar("Olokinho meu");
		professor.falar("teste", "Testando");
	}
}
