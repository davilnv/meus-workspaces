package capitulo05;

public class Scope {
	private static int x = 1;
	public static void main(String[] args) {
		int x = 5;
		
		System.out.printf("local x no main é %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("%nlocal x no main é %d", x);
	}
	
	public static void useLocalVariable() {
		int x = 25;
		System.out.printf("%nlocal x no método de entrada useLocalVariable é %d%n", x);
		++x;
		System.out.printf("local x antes de usar o método useLocalVariable é %d%n", x);
	}
	
	public static void useField() {
		System.out.printf("%ncampo x no método de entrada useField é %d%n", x);
		x *= 10;
		System.out.printf("campo x antes de usar o método useField é %d%n", x);
	}
}
