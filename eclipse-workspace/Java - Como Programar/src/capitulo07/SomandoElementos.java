package capitulo07;

public class SomandoElementos {
	public static void main(String[] args) {
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for (int i = 0; i < array.length; i++)
			total += array[i];
		
		System.out.printf("Total da soma de elementos do array: %d%n", total);
	}
}
