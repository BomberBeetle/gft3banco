package com.bancogftstart3;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("-- Conta Corrente --");
		this.imprimirPropriedades();
	}
}
