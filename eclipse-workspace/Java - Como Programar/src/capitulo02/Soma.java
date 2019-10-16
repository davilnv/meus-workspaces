package capitulo02;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		System.out.print("Número 1: ");
		num1 = teclado.nextInt();
		System.out.print("Número 2: ");
		num2 = teclado.nextInt();
		soma = num1 + num2;
		System.out.printf("Soma é %d%n", soma);
		teclado.close();
	}
}
