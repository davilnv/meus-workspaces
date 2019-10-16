package capitulo05;

public class Sobrecarga {
	public static void main(String[] args) {
		System.out.printf("Quadrado do inteiro 7 é %d%n", square(7));
		System.out.printf("Quadrado do double 7.5 é %.2f%n", square(7.5));
	}
	
	public static int square(int intValue) {
		System.out.printf("%nChamada de método square com argumento int: %d%n", intValue);
		return intValue * intValue;
	}
	
	public static double square(double doubleValue) {
		System.out.printf("%nChamada de método square com argumento double: %.1f%n", doubleValue);
		return doubleValue * doubleValue;
	}
}
