package com.bancogftstart3;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void listarContas() {
		for(int i = 0; i < contas.size(); i++) {
			contas.get(i).imprimirExtrato();
		}
	}
	
}
