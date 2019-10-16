package model;

import java.util.ArrayList;

public class Banco {
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static boolean addConta(Conta conta) {
		for (Conta c : contas) {
			if (c.getNumeroConta() == conta.getNumeroConta()) {
				return false;
			}
		}
		return contas.add(conta);
	}
	
	public static boolean buscarConta(int numeroConta, String senha) {
		for (Conta c : contas) {
			if (c.getNumeroConta() == numeroConta && c.getSenha().equals(senha))
				return true;
		}
		return false;
	}
	
	public static Conta buscarConta(int numeroConta) {
		for (Conta c : contas) {
			if (c.getNumeroConta() == numeroConta)
				return c;
		}
		return null;
	}
	public static boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		if (contaOrigem.sacar(valor) && contaDestino.depositar(valor))
			return true;
		return false;
	}
}
