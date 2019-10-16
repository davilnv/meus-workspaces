package capitulo07;

public class Array {
	public static void main(String[] args) {
//		int[] array = new int[10];
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
	}
}
