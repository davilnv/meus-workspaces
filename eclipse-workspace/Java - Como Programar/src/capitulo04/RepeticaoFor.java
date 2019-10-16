package capitulo04;

import java.util.ArrayList;

public class RepeticaoFor {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++ ) {
			System.out.printf("%d ", i);
		}
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Davi");
		lista.add("Aline");
		lista.add("Mariana");
		for (String teste : lista) {
			System.out.println(teste);
		}
	}
}
