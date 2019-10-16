package capitulo05;

import java.util.Scanner;

public class Maximo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite três números de ponto flutuante separados por espaço: ");
		double numero1 = teclado.nextDouble();
		double numero2 = teclado.nextDouble();
		double numero3 = teclado.nextDouble();
		
		double resultado = maximo(numero1, numero2, numero3);
		
		System.out.println("Máximo é: "  + resultado);
		teclado.close();
	}
	
	public static double maximo(double x, double y, double z) {
		double valorMaximo = x;
		
		if (y > valorMaximo)
			valorMaximo = y;
		
		if (z > valorMaximo)
			valorMaximo = z;
		
		return valorMaximo;
	}
}
