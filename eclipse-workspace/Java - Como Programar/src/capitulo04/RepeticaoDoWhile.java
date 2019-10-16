package capitulo04;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		int contador = 1;
		
		do {
			System.out.printf("%d ", contador);
			++contador;
		} while (contador <= 10);
		System.out.println();
		
		contador = 1;
		while(contador <= 10) {
			System.out.printf("%d ", contador);
			++contador;
		}
		System.out.println();
		
	}
}
