package capitulo03;

public class incremento {
	public static void main(String[] args) {
		int a = 0;
		System.out.println(++a); // Incrementa e mostra o novo valor >> 1
		System.out.println(++a); // Incrementa e mostra o novo valor >> 2
		System.out.println(a++); // Mostra o valor atual e Incrementa >> 2
		System.out.println(a); // Mostrando o valor atual >> 3
		System.out.println(a++); // Mostra o valor atual e Incrementa >> 3
		System.out.println(a); // Mostrando o valor atual >> 4
	}
}
