package sistema_produtos;

import java.time.LocalDate;

public class Validar {
	public static boolean isVencido(Produto produto) {
		LocalDate dataAtual = LocalDate.now();
		if (produto.getValidade().isBefore(dataAtual))
			return true;
		return false;
	}
}
