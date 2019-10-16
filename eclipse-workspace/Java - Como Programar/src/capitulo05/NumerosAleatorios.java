package capitulo05;

import java.security.SecureRandom;

public class NumerosAleatorios {
	public static int jogarDados() {
		SecureRandom numerosAleatorios = new SecureRandom();
		int face = 1 + numerosAleatorios.nextInt(6);
		return face;
	}
}
