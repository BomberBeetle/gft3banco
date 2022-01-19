package com.bancogftstart3;

public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQ = 0;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.saldo = 0d;
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQ++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * 
	 * @param valor
	 * @return Sucesso da operação
	 */
	public boolean sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean transferir(double valor, IConta destino) {
		if(this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	protected void imprimirPropriedades() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Número: " + Integer.toString(this.numero));
		System.out.println("Agência: " + Integer.toString(this.agencia));
		System.out.println("Saldo: " + Double.toString(this.saldo));
	}
}
