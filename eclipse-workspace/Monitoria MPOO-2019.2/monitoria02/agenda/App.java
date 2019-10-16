package agenda;

public class App {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.adicionar("Davi");
		agenda.adicionar("Bia");
		agenda.adicionar("Aline", 998934491);
		agenda.adicionar("Pedro", 111111111, true);
		agenda.adicionar("Tiago", 222222222, true);
		agenda.adicionar("João", 333333333, true);
		agenda.exibirContatos();
		
		System.out.println("\n===== Depois da Remoção =====");
		agenda.remover(agenda.buscar("Davi"));
		agenda.exibirContatos();
		
		//Removendo Favoritos
		for (Contato c : agenda.buscar(true)) {
			agenda.remover(c);
		}
		
		System.out.println("\n===== Depois da Remoção dos Favoritos =====");
		agenda.exibirContatos();
	}
}
