package capitulo02;

import javax.swing.JOptionPane;

public class CaixaDialogoEntrada {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		String mensagem = String.format("Bem-vindo, %s, ao Java", nome);
		JOptionPane.showMessageDialog(null, mensagem);
		
		String num1 = JOptionPane.showInputDialog("Digite um número: ");
		int soma;
		soma = 10 + Integer.parseInt(num1);
		JOptionPane.showMessageDialog(null, soma);
		
	}
}
