package capitulo03;

public class LacoWhile {
	public static void main(String[] args) {
		int nota = 0;
		while (nota <= 10) {
			System.out.println(nota);
			nota ++;
		}
		
		// Solução do problema na divisão de dois inteiros que resulta um inteiro
		int total = 846;
		int num = 10;
		float divisao = (float) total / num;
		System.out.println(divisao);
	}
}
