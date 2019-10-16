package capitulo03;

public class Test {
	public static void main(String[] args) {
		int nota = 5;
		if (nota >= 7)
			System.out.println("Passou");
		else
		System.out.println("Não Passou");
		
		System.out.println(nota >= 7 ? "Passou" : "Não Passou");
	}
}
